package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();


        System.out.println("동물소리 테스트 시작");
        dog.sound();
        cat.sound();
        caw.sound();
        System.out.println("동물소리 테스트 종료");

        soundCaw(caw);
    }

    private static void soundCaw(Caw caw) {

    }
}
