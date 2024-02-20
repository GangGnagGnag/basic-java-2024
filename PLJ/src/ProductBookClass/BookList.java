package ProductBookClass;

public class BookList {
    private String title;                 //책이름
    private String author;              //저자
    private int price;                  // 가격
    private String publisher;           //출판사
    private final float tax = 1.1f;     //필드 고정값(세금)


// 생성자
    public BookList(String title, String author, int price, String publisher){
        this.title  = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }
    
    /*
    getter 메서드는 private으로 선언된 멤버 변수의 값을 외부로 반환하는 역할을 함
    setter 메서드는 private으로 선언된 멤버 변수의 값을 설정(또는 변경)하는 역할을 함
     */

    
//    getter 메서드
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }


    // Setter 메서드
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // 세율 정보는 고정된 값이므로 getter 로만 정의
    public float getTax() {
        return tax;
    }
}

