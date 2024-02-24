package 접근제어자.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData ad = new AccessData();

//        public 호출 가능
        ad.publicField = 1;
        ad.publicMethod();

//        같은 패키디 default 호출 가능
        ad.defaultField = 2;
        ad.defualtMethod();

//        private 호출 불가
//        ad.privateField = 3;
//        ad.privateMethod();

        ad.innerAccess();
//        와부에서 ineerAccess 호출가능

    }
}
