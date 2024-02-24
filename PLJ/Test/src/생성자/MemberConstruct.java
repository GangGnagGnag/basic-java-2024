package 생성자;

public class MemberConstruct {
    String name;
    int age;
    int grade;


//       추가
//    생성자 오버로딩
//    MemberConstruct(String name, int age){
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
//    }
    MemberConstruct(String name, int age){
        this(name,age,50);
        System.out.println();
}


//    아래쪽 부분이 생성자 부분이다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" +
                grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
