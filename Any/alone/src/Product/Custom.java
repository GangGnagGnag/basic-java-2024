package Product;

public class Custom {
    int id;
    String name;
    int age;

    //  생성자를 만들어서
    Custom(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void CustomInfo(){   // Info 를 사용해서 메서드를 생성하여 메인 클래스에서 Info 를 불러 값을 호출
        String human = "회원 번호: " + id + "이름: " + name + "나이: " + age;
        human += " 회원 생성";
        System.out.println(human);
    }

}
