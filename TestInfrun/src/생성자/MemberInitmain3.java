package 생성자;

public class MemberInitmain3 {
    public static void main(String[] args) {
        MemberInit mb = new MemberInit();
        mb.initMember("한국진", 29, 8);

        MemberInit mb2 = new MemberInit();
        mb2.initMember("박창현", 28, 7);

        MemberInit[] members = {mb, mb2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + "나이: " + s.age + "성적: " + s.grade);
        }
    }
}