package ProductBookClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bookmain {
    public static Scanner sc = new Scanner(System.in);
    public static List<BookList> list = new ArrayList<BookList>();


    public static void main(String[] args) {
        while (true) {
            System.out.print("1. 도서 등록");
            System.out.print(" | 2. 도서 검색");
            System.out.print(" | 3. 도서 삭제");
            System.out.print(" | 4. 도서 확인");       // 전체도서 출력
            System.out.print(" | 5. 도서 구입");       //구입방법은 전자책 종이책으로 책,이름,가격,구입완료 출력
            System.out.println(" | 0. 종료 |");
            System.out.print("선택 번호 : ");
            int choice = sc.nextInt();
            sc.nextLine();

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
                    checkBook();
                    break;
                case 5:
                    buyBook();
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    //    책 등록
    public static void registerBook() {
        System.out.println("1. 종이책 등록 | 2. 전자책 등록");
        System.out.print(">>");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                addPaperBook();
                break;
            case 2:
                addEBook();
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }

    public static void addPaperBook() {

        System.out.print("책 이름: ");
        String title = sc.nextLine();
        System.out.print("책 저자: ");
        String author = sc.nextLine();
        System.out.print("출판사: ");
        String publisher = sc.nextLine();
        System.out.print("가격: ");
        int price = sc.nextInt();
        System.out.print("페이지 수 : ");
        int sizeInfo = sc.nextInt();
        sc.nextLine();
        System.out.println(title + " 종이 책 등록완");
        list.add(new PaperBook(title, author, publisher, price, sizeInfo));
    }

    public static void addEBook() {
        System.out.print("호환기기: ");
        String compatibleDevices = sc.nextLine();
        System.out.print("책 이름: ");
        String title = sc.nextLine();
        System.out.print("책 저자: ");
        String author = sc.nextLine();
        System.out.print("출판사: ");
        String publisher = sc.nextLine();
        System.out.print("가격: ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.println(title + " 전자 책 등록완");
        list.add(new Ebook(title, author, price, publisher, compatibleDevices));
    }

    public static void searchBook() {
        System.out.print("찾고싶은 책이 무엇이냐~?: ");
        String word = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTitle().equals(word) || list.get(i).getAuthor().equals(word)) {
                System.out.println("책이름: " + list.get(i).getTitle() + "\n저자: " + list.get(i).getAuthor() + " 찾았습니다.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("책이 없습니다.");
        }
    }

    public static void deleteBook() {
        System.out.println("무슨 책을 삭제 하고 싶농? ");
        String title = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTitle().equals(title)) {
                System.out.println("책을 삭제합니다.");
                list.remove(i);
                found = true;
            }
        }
        if (!found) {                                    //for문 안에 if 문이 한번도 true가 된 적이 없다면 이라는 의미.
            System.out.println("책이 없습니다.");
        }
    }

    public static void checkBook() {
        System.out.println("도서 확인");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Ebook) {
                Ebook eb = (Ebook) list.get(i);                            //강제 타입 변환 deviceInfo 사용가능
                String msg = "책이름: " + list.get(i).getTitle() + " 책 저자: " + list.get(i).getAuthor()
                        + " 가격: " + list.get(i).getPrice() + " 출판사: " + list.get(i).getPublisher();
                System.out.println(msg + eb.deviceInfo());
            } else if (list.get(i) instanceof PaperBook fb) {            //   Ebook eb = (Ebook) list.get(i); //강제 타입 변환 deviceInfo 사용가능 이게 한줄로 바뀐거임
                int a = fb.getSize();
                System.out.println(a);
            }
//                                                                            msg 를 변수 선언해서 값을 print 안에 넣어줌
        }
    }

    public static void buyBook() {
        System.out.println("구매 하시겠습니까?");
        System.out.println("1. 종이책 | 2. 전자책 ");
        int check = sc.nextInt();
        int sum = 0;
        int qwe = 0;
        sc.nextLine();

        switch (check) {
            case 1:
                System.out.print("구입 하고싶은 책 제목: ");
                String title = sc.nextLine();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) instanceof PaperBook) {
                        PaperBook fb = (PaperBook) list.get(i);
                        sum += fb.getPrice();
                        qwe = (int) (sum * fb.getTax());
                        System.out.println(fb.getTitle());

                        if (list.get(i).equals(title)) {
                            System.out.println(title + " 책을 구매 하셨습니다.");
                        }
                    }
                }
                break;

            case 2:
                System.out.println("구입 하고싶은 책 제목: ");
                String title1 = sc.nextLine();
                System.out.println();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) instanceof Ebook eb) {
                        sum += eb.getPrice();
                        qwe = (int) (sum * eb.getTax());
                        System.out.println(eb.getTitle());

                        if (list.get(i).equals(title1)) {
                            System.out.println(title1 + " 책을 구매 하셨습니다.");
                        }
                    }
                }
                break;
        }
        if (sum == 0) {
            System.out.println("구매 할 책이 없습니다.");
        } else {
            System.out.println("부가세 포함 가격: " + qwe);
        }
    }
}
