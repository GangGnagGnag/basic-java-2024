package ProductBookClass2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    private static ArrayList<Book> bookList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("메뉴를 선택하세요:");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 검색");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 확인");
            System.out.println("5. 도서 구입");
            System.out.println("0. 종료");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    registerBook();
                    break;
                case 2:
                    searchBook();
                    break;
                case 3:
                    deleteBook();
                    break;
                case 4:
                    displayBooks();
                    break;
                case 5:
                    purchaseBook();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        } while (choice != 0);
    }

    private static void registerBook() {
        System.out.println("도서 등록을 시작합니다.");
        System.out.print("제목: ");
        String title = scanner.next();
        System.out.print("저자: ");
        String author = scanner.next();
        System.out.print("가격: ");
        int price = scanner.nextInt();
        System.out.print("출판사: ");
        String publisher = scanner.next();
        System.out.println("1. 종이책  2. 전자책");
        int type = scanner.nextInt();
        if (type == 1) {
            System.out.print("크기: ");
            String size = scanner.next();
            PaperBook paperBook = new PaperBook(title, author, price, publisher, size);
            bookList.add(paperBook);
        } else if (type == 2) {
            System.out.print("장치 정보: ");
            String devices = scanner.next();
            Ebook ebook = new Ebook(title, author, price, publisher, devices);
            bookList.add(ebook);
        } else {
            System.out.println("잘못된 입력입니다.");
        }
        System.out.println("도서 등록이 완료되었습니다.");
    }

    private static void searchBook() {
        System.out.println("도서 검색을 시작합니다.");
        System.out.print("검색할 도서의 제목을 입력하세요: ");
        String searchTitle = scanner.next();
        boolean found = false;
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                System.out.println("도서를 찾았습니다:");
                System.out.println("제목: " + book.getTitle());
                System.out.println("저자: " + book.getAuthor());
                System.out.println("가격: " + book.getPrice() + "원");
                found = true;
            }
        }
        if (!found) {
            System.out.println("해당 도서를 찾을 수 없습니다.");
        }
    }

    private static void deleteBook() {
        // 도서 삭제 기능 구현
    }

    private static void displayBooks() {
        System.out.println("도서 목록:");
        for (Book book : bookList) {
            System.out.println(book.getTitle() + " - " + book.getAuthor() + " - " + book.getPrice() + "원");
        }
    }

    private static void purchaseBook() {
        // 도서 구입 기능 구현
    }
}
