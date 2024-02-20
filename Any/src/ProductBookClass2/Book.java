package ProductBookClass2;

public class Book {

        private String title;
        private String author;
        private int price;
        private String publisher;
        private final float tax = 1.1f; // 고정된 세율

        // 생성자
        public Book(String title, String author, int price, String publisher) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.publisher = publisher;
        }

        // Getter 메서드들
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

        // Setter 메서드들
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

        // 세율 정보는 getter로만 제공
        public float getTax() {
            return tax;
        }
    }

