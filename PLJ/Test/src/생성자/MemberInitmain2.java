package 생성자;

public class MemberInitmain2 {
    public static void main(String[] args) {
        MemberInit mb = new MemberInit();
        initMember(mb, "한국진", 29,8);

        MemberInit mb2 = new MemberInit();
        initMember(mb, "박창현", 28,7);

        MemberInit[] members = {mb, mb2};

        for(MemberInit s : members) {
            System.out.println("이름: " + s.name + "나이: " + s.age + "성적: " + s.grade);
        }
    }

    static void initMember(MemberInit mb, String name, int age, int grade){
        mb.name = name;
        mb.age = age;
        mb.grade = grade;
    }
}
/*
MemberInit 객체 생성:

MemberInit mb = new MemberInit();
MemberInit mb2 = new MemberInit();
MemberInit 객체 초기화:

initMember(mb, "한국진", 29, 8);
initMember(mb2, "박창현", 28, 7);
MemberInit 객체 배열 생성 및 초기화:

MemberInit[] members = {mb, mb2};
배열 내 객체 정보 출력:

for (MemberInit s : members) {
System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);

MemberInit 객체 배열 생성 이유:
여러 객체 저장: 배열은 동일한 유형의 여러 객체를 연속된 메모리 위치에 저장할 수 있는 기본적인 자료구조입니다.
 members 배열은 MemberInit 객체를 저장하도록 설계되어 여러 멤버 인스턴스를 효과적으로 생성 및 관리할 수 있도록 합니다.

효율적인 접근 및 관리: 배열을 사용하면 단일 변수 이름 (members)으로 여러 멤버 객체에 접근하고 조작할 수 있습니다.
이는 코드를 단순화하고 효율성을 높여줍니다. 특히 많은 멤버를 처리할 때 유용합니다.

메서드에 전달: 배열은 메서드의 인수로 전달될 수 있어 여러 객체를 한 번에 전송하는 편리한 방법을 제공합니다.
이는 특정 기준에 따라 객체를 정렬하거나 반복 처리하는 등 그룹 객체에 대한 작업을 수행할 때 유용합니다.

핵심 요약:
배열은 동일한 유형의 객체 컬렉션을 저장하고 관리하는 데 필수적입니다.
이 코드의 members 배열은 MemberInit 객체를 효율적으로 접근하고 조작하기 위한 특정 목적으로 사용됩니다.
배열을 이해하는 것은 잘 구조화되고 효율적인 Java 코드를 작성하는 데 매우 중요합니다.
 */