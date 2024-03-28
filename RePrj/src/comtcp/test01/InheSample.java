package comtcp.test01;

class Animal{
    int num = 10;
    String name;// 맴버변수
    Animal() {
        System.out.println("Animal 생성자");
    }
    void setName(String name){  // 맴버함수
        this.name = name;
    }
}
class Dog extends Animal{   //Animal 클래스 상속
    int num = 20;
    Dog(){
        System.out.println("Dog 생성자");
    }
    void sleep() {  // 재정의(상속관계)
        System.out.println(this.name + "~~~~");
    }
}
class HouseDog extends Dog{
    int num = 30;
    HouseDog(){}
    HouseDog(String name){ //클래스명과 동일한 메서드, 출력이 없다. - 생성자(객체생성과 초기화)
        this.setName(name);
        System.out.println("HouseDog 생성자");
    }
    @Override
    void sleep() {  // 다중정의 (매게변수 타입, 순서, 갯수가 다를때)
        System.out.println(this.name + "zzzz");
    }
    void sleep(int h){  // 다중정의
        System.out.println(this.name + "zzzz" + h + "자농");
    }
    void numPrint(){
        System.out.printf("Anum: %d Dnum: %d Hnum: %d \n",super.num, super.num, this.num);
}

public class InheSample {
    public static void main(String[] args) {
//        Dog dog = new Dog(); // Dog 객체 생성
//        dog.setName("똥개");
//        System.out.println(dog.name);
//        dog.sleep();
//        HouseDog hd = new HouseDog("누네띠네");
//        hd.setName("Happy");
//        hd.sleep();
//        hd.sleep(3);    // 다중정의 메서드 호출시 입력 주의
//        System.out.println(hd.name);
//        HouseDog hd2 = new HouseDog();
        Animal a = new Animal();    // 다형성 : 부모는 자식객체를 가리킬수 있다.
        Dog d = new Dog();
        HouseDog hd = new HouseDog();

        Animal a2 = new Dog();
        Animal a3 = new HouseDog();

        HouseDog hd2 = (HouseDog)new Dog(); // downCasting
        }
    }
}
