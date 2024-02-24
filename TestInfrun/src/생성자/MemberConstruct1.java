package 생성자;

public class MemberConstruct1 {
    public static void main(String[] args) {
//      객체를 생성과 동시에 생성자를 불러라 라는 의미로 () 안에 바로 값을 넣어야함.
//        인스턴스를 생성하고 즉시 해당 생성자를 호출한다
        MemberConstruct mc = new MemberConstruct("한국이 ", 29, 9);
        MemberConstruct mc2 = new MemberConstruct("창현이 ", 29, 9);
        MemberConstruct mc3 = new MemberConstruct("판슥이 ", 29, 9);

//        추가
        MemberConstruct m4 = new MemberConstruct("성주옹",40);
/*
객체를 생성하면서 어떤 생성자를 쓸건지 조건을 같이 맞추는것,
 */
        MemberConstruct[] mb =  { mc, mc2, mc3, m4};

        for(MemberConstruct a : mb) {
            System.out.println("이름: " + a.name + "나이: " + a.age + "학년: " + a.grade);
        }
    }
}

