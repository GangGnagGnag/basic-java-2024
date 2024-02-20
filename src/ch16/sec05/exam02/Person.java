package ch16.sec05.exam02;

public class Person {
    public void ordering(Comparable comparable) {
        String a = "한국짜이";
        String b = "두국짜이";
        
        int result = comparable.compare(a, b);
        
        if(result < 0) {
            System.out.println(a + "는 " + b + " 보다 앞에 옵니다");
        }else if (result == 0) {
            System.out.println(a + "는 " + b + " 랑 같노");
        } else {
            System.out.println(a + "는 " + b + " 보다 뒤에 오노");
        }
    }
}
