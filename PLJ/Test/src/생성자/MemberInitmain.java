package 생성자;

public class MemberInitmain {
    public static void main(String[] args) {
        MemberInit mb = new MemberInit();

        mb.name = "한국진";
        mb.age = 29;
        mb.grade = 8;

        MemberInit mb2 = new MemberInit();
        mb2.name = "박창현";
        mb2.age = 28;
        mb.grade = 7;

        MemberInit[] members = {mb, mb2};

        for(MemberInit s : members) {
            System.out.println("이름" + s.name + "나이" + s.age + "성적" + s.grade);
        }
    }
}
