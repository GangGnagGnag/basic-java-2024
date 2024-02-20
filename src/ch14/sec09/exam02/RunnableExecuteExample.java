package ch14.sec09.exam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class RunnableExecuteExample {
    public static void main(String[] args) {

//        1000 개의 메일 생성
        String[][] mails = new String[1000][3];             //string 타입이 3개 저장되는 방을 가지고있음
        for(int i=0; i<mails.length; i++) {                 
            mails[i][0] = "naver.com";
            mails[i][1] = "member" + i + ".com";
            mails[i][2] = "신상품 입고";
        }
//        ExecutorService 생성
        ExecutorService executorService = Executors.newFixedThreadPool(5);     //대기할 수 있는 작업수가 5개
//        이 코드를 실행하면 작업큐가 만들어짐 

//        이메일을 보내는 작업 생성 및 처리 요청
        for(int i=0; i<1000; i++) {
            final int idx = i;      //idx 인덱스 줄임말
            executorService.execute(new Runnable() {      
                //익명구현객체 만듦 어떤것뒤에 (가 오면 입력임. 
                @Override
                public void run() {             //실질적으로 작업큐에 밀어넣는것
                    Thread thread = Thread.currentThread();             // 로컬 클래스 for문이라는 범위 안에 들어와 있기 때문에
                    String from = mails[idx][0];
                    String to = mails[idx][1];
                    String content = mails[idx][2];
                    System.out.println(" [" + thread.getName() + "]" + from + "==>" + to + ": " + content);
//                    위에 만든 5개의 작업방을 만들어 놓은곳에 작업을 밀어넣는것
                }
            });
        }
//        ExecutorService종료
        executorService.shutdown();
    }
}
