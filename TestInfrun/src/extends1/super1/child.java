package extends1.super1;

public class child extends Parent{

    public String value = "child";

    @Override
    public void hello(){
        System.out.println("Child hellos");
    }

    public void call() {
        System.out.println("this.value = " + this.value); // this 생략가능
        System.out.println("this.value = " + super.value);

//        만약 this를 안붙일경우에는 컴파일러가 클래스 안에서 먼저 찾고 없는 경우게 부모 클래스에서 찾음

    }
}
