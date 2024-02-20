package ch09.sec07.exam2;

public class Home {
//    필드에 익명 구현 객체 대입
    private  RemoteControl rc = new RemoteControl() {
    @Override
    public void turnOn() {
        System.out.println("TV 를 켜노");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끄노");
    }
};
    
//    메소드 (필드 이용)
    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    public void use2() {
//        로컬 변수에 익명 구현 객체 대입
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨을 켜노");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨을 끄노");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

//    메소드(매개변수 이용)
    public void use3(RemoteControl rc){
        rc.turnOn();
        rc.turnOff();
    }
}
