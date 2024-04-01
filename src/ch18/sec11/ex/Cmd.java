package ch18.sec11.ex;

import java.io.*;
import java.util.Scanner;

public class Cmd {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean yes = true;
        int num;
        while (yes) {
            System.out.println("--------------------------------");
            System.out.println("1. 로그인    2. 회원가입     3. 종료 >");
            System.out.print(" >> ");
            if(sc.hasNextInt()) {
                num = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("다시 입력하여 주세요");
                sc.nextLine();
                continue;
            }
            switch (num) {
                case 1:
                    login(sc);
                    break;
                case 2:
                    signup(sc);
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다");
                    break;
                default:
                    System.out.println("숫자를 입력하세요");
            }
        }
    }

    public static void login(Scanner sc) throws IOException {
        System.out.print("아이디 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호 : ");
        String pw = sc.nextLine();

        // 파일에서 사용자 정보를 읽어와서 일치하는지 확인
        try (BufferedReader reader = new BufferedReader(new FileReader("./users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2 && parts[0].equals(id) && parts[1].equals(pw)) {
                    System.out.println("로그인 성공!");
                    return;
                }
            }
        }

        System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
    }

    private static void signup(Scanner sc) throws IOException {
        while(true){
        System.out.print("아이디 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호 : ");
        String pw = sc.nextLine();
        System.out.println("이름을 입력하세요");
        System.out.print(">> ");
        String name = sc.nextLine();
        System.out.println("나이를 입력하세요");
        System.out.print(">> ");
        int age;
        if(sc.hasNextInt()){
            age = sc.nextInt();
            sc.nextLine();
        } else {
            System.out.println("나이를 정확하게 입력하세요");
            sc.nextLine();
        }
        System.out.println("주소를 입력하세요");
        System.out.print(">> ");
        String add = sc.nextLine();


        // 회원가입 정보를 파일에 저장
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./users.txt", true))) {
            writer.write("id: " + id + "\n pw: " + pw + "\n name" + name + "\n age" + "\n add" + add);
            writer.newLine();
        }

        System.out.println("회원가입이 완료되었습니다.");
    }
}
 }
