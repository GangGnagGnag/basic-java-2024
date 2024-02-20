package ch09.sec06.exam03;

public class Button {
//    정적 맴버 인터페이스
    public static interface ClickListener {
//        추상 메소드
        void onClick();
    }

//    필드
    private ClickListener clickListener;

//    메소드
    public void setClickListener(ClickListener clickListener) { //클릭리스너 타입의 객체를 받을 수 있다.
        this.clickListener = clickListener;
//        어떤 객체를 나타내는지 확인해야하기때문에 this 사용
    }

    public void click() {
        this.clickListener.onClick();  // this 생략가능
//        클릭 리스너 이름이 하나 밖에 사용되어 있지 않기때문에 당연히 필드이름을 나타내기때문
    }

}
