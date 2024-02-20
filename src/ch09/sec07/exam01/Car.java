package ch09.sec07.exam01;

public class Car {
    //    필드에 Tire 객체 대입
    private Tire tire1 = new Tire();

    //    필드에 익명 자식 객체 대입
    private Tire tire2 = new Tire() {           //타이어 자식 객체 , { 블럭이 익명객체를 만드는 코드이다
        @Override
        public void roll() {
            System.out.println("익명 자식 Tire 객체 1이 굴러가유~");
        }
    };          // 타이어를 상속받는 자식 객체의 내용이 나옴.

    //    메소드(필드 이용)
    public void run1() {
        tire1.roll();
        tire2.roll(); //자식 객체에 있는 재정의된 객체가 실행됨
    }

    //    메소드 (로컬 변수 이용)
    public void run2() {
//        로컬 변수에 익명 자식 객체 대입
        Tire tire = new Tire() {                    //자식객체가 타입이 확실히 정해진게 없기 때문에 부모객체 타입으로만 접근이 가능하다.
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 2 가 굴라가유~");
            }
        };
        tire.roll();
    }

    //    메소드 (매개변수 이용)
    public void run3(Tire tire) {           //익명 자식 객체를 가리키는 형태임
        tire.roll();
    }
}

