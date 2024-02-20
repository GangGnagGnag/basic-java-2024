package ch11.sec02.exam01;

import org.w3c.dom.ls.LSOutput;

public class ExceptionHandingExample1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자수: " + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작] \n");
        printLength("ThisIsJava");      // 참조 변수에 글자 수 만큼의 값이 result 에 저장됨
        printLength(null);      //참조 변수에 null 값이 들어가 있기 때문에 아무런 값이 없음
        System.out.println("[프로그램 종료]");
    }
}
