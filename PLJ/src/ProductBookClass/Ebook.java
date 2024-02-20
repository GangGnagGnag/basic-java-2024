package ProductBookClass;

public class Ebook extends BookList {
    String compatibleDevices;       //  호환장치 변수 선언

    public Ebook(String title, String author, int price, String publisher, String compatibleDevices) {
        super(title, author, price, publisher);
        this.compatibleDevices = compatibleDevices;
    }

    public String getcompatiblieDevices() {
        return compatibleDevices;
    }

    public void setCompatibleDevices(String compatibleDevices) {
        this.compatibleDevices = compatibleDevices;
    }

    public String deviceInfo() {
        return " 호환정보는: " + compatibleDevices;
    }
}



