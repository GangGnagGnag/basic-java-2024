package ProductBookClass2;

public class PaperBook extends Book {
        private String size;

        public PaperBook(String title, String author, int price, String publisher, String size) {
            super(title, author, price, publisher);
            this.size = size;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public void sizeInfo() {
            System.out.println("종이책 크기 정보: " + size);
        }
    }

