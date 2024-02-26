package 생성자.ex;

import org.w3c.dom.ls.LSOutput;

public class Book {
        String title; //제목
        String author; //저자
        int page; //페이지 수

        Book() {// 기본생성자
                this("", "", 0);
        }


        Book(String title, String author){
                this.title = title;
                this.author = author;
                this.page = 0;
        }

        Book(String title, String author, int page){
                this.title = title;
                this.author = author;
                this.page = page;
        }

        void displayInfo() {
                System.out.println("제목: " + title + "저자: " + author +"페이지: "+ page);
        }
}
