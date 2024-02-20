package ch16.sec02.exam02;

public class ButtonExample {
    public static void main(String[] args) {
//        ok 버튼 객체 생성
        Button btnOK = new Button();

//        ok 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
        btnOK.setClickListener(() -> {                      //매개값으로 람다식대입
            System.out.println("Ok 버튼을 클릭했농");
        });

//        ok버튼 클릭하기
        btnOK.click();

//      Cancel 버튼 객체 생성
        Button btnCancel = new Button();

//        Cancel 버튼 객체에 람다식(Clickstener 익명 구현 객체) 주입
        btnCancel.setClickListener(()->{
            System.out.println("Cancel 버튼을 클릭했농");
        });

//        Cancel 버튼 클릭하기
        btnCancel.click();
    }
}
