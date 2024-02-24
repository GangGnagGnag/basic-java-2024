package 생성자;

public class MemberInit {
//    맴버 변수
    String name;
    int age;
    int grade;

    //  메서드 추가
    void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
        /*
        맴버 변수와 매서드의 매개변수의 이름이 같을 때 구분하기 위해 사용
        this는 가까운 매개변수가 우선순위를 가짐
         */
    }
}
