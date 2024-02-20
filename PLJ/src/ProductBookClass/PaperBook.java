package ProductBookClass;

public class PaperBook extends BookList {

    int size;

    public PaperBook(String title, String author, String publisher, int price, int size) {
        super(title, author, price, publisher);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) { this.size = size;
    }
}

