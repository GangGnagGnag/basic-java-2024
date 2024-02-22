package 생성자;

public class MemberConstruct {
    String name;
    int age;
    int grade;

//    아래쪽 부분이 생성자 부분이다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" +
                grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
