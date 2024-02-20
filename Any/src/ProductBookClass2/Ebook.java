package ProductBookClass2;

public class Ebook extends Book {
    private String superDevices;

    public Ebook(String title, String author, int price, String publisher, String superDevices) {
        super(title, author, price, publisher);
        this.superDevices = superDevices;
    }

    public String getSuperDevices() {
        return superDevices;
    }

    public void setSuperDevices(String superDevices) {
        this.superDevices = superDevices;
    }

    public void deviceInfo() {
        System.out.println("전자책 장치 정보: " + superDevices);
    }
}
