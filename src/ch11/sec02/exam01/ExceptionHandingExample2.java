package ch11.sec02.exam01;

public class ExceptionHandingExample2 {
    public static void printLength(String data) {
        try{
        int result = data.length();
        System.out.println("문자수: " + result);
    }
        catch (NullPointerException e) {
            //예외 정보를 얻을수 있는3가지                                      다음과 같이 결과가 나옴
            System.out.println(e.getMessage());     // Cannot invoke "String.length()" because "data" is null
//            System.out.println(e.toString());       //java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
           // e.printStackTrace();                       //   java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
                                                        //   at ch11.sec02.exam01.ExceptionHandingExample2.printLength(ExceptionHandingExample2.java:6)
                                                        //    at ch11.sec02.exam01.ExceptionHandingExample2.main(ExceptionHandingExample2.java:23)*/
        }
        finally {
            System.out.println("[마무리 실행] \n");
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작] \n");
        printLength("ThisIsJava");      // 참조 변수에 글자 수 만큼의 값이 result 에 저장됨
        printLength(null);      //참조 변수에 null 값이 들어가 있기 때문에 아무런 값이 없음
        System.out.println("[프로그램 종료]");
    }
}
