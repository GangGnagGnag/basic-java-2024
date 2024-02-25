package Static1;

public class DataCountMain3 {
    public static void main(String[] args) {

            Data3 data1 = new Data3("A");
            System.out.println("A count=" + Data3.count);

            Data3 data2 = new Data3("B");
            System.out.println("B count=" + Data3.count);

            Data3 data3 = new Data3("C");
            System.out.println("C count=" + Data3.count);

//             추가
//        인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);
//정적 변수의 경우 인스턴스를 통한 접근은 추천하지 않는다. 왜냐하면 코드를 읽을 때 마치 인스턴스 변수에 접근하는
//것 처럼 오해할 수 있기 때문이다.

//        클래스를 통한 접근
        System.out.println(Data3.count);
//정적 변수는 클래스에서 공용으로 관리하기 때문에 클래스를 통해서 접근하는 것이 더 명확하다. 따라서 정적 변수에 접
//근할 때는 클래스를 통해서 접근하자.
        }
    }