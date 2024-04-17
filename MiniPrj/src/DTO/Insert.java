package DTO;

import java.sql.*;
import java.util.InputMismatchException;

public class Insert extends ResChoice {
    public static void insertClass() {
        System.out.println("전화번호를 입력하세요 ( - 포함!)");
        System.out.print(">> ");
        String memberID = sc.nextLine();

        int memberPW = 0;
        while (true) {
            try {
                System.out.println("비밀번호를 입력하세요 (ex 1234)");
                System.out.print(">> ");
                memberPW = sc.nextInt();
                sc.nextLine();
                break; // 올바른 입력을 받았으므로 루프 종료
            } catch (InputMismatchException e) {
                System.out.println("올바른 숫자를 입력하세요.");
                sc.nextLine(); // 잘못된 입력을 버리기
            }
        }

        System.out.println("이름을 입력하세요");
        System.out.print(">> ");
        String memberName = sc.nextLine();

        int increaseCount = 0; // increaseCount 초기화
        while(true){
            try{
                System.out.print("등록 횟수 : ");
                increaseCount = sc.nextInt();
                sc.nextLine();
                if (increaseCount <= 0) {
                    System.out.println("0 이하의 값을 입력할 수 없습니다. 다시 입력하세요.");
                } else {
                    break;
                }
            } catch (InputMismatchException e ){
                System.out.println("잘못 입력하셨습니다.");
                sc.nextLine();
            }
        }

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PW);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        String sql = "INSERT INTO MEMBER (MEMBERID, MEMBERPW, MEMBERNAME, MEMBERCOUNT) VALUES (?,?,?,?)";
        PreparedStatement pstm = null;

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, memberID);
            pstm.setInt(2, memberPW);
            pstm.setString(3, memberName);
            pstm.setInt(4, increaseCount);

            int res = pstm.executeUpdate();
            if (res > 0) {
                System.out.println("회원 등록이 완료 되었습니다");
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도해 주세요.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
