package override;

public class Car {
    public void move(){
        System.out.println("차를 이동합니다");
    }

//    기능추가
    public void openDoor(){
        System.out.println("문을 엽니다");
//        부모 클래스에만 기능을 추가하면 다른 클래스는 상속이 되기 떄문에 추가할 필요가없음
        
    }
}
