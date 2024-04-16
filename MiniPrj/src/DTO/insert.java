package DTO;

import java.sql.*;
import java.util.InputMismatchException;

public class insert extends ResChoice {
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
                sc.nextLine(); // 버퍼 비우기
                break; // 올바른 입력을 받았으므로 루프 종료
            } catch (InputMismatchException e) {
                System.out.println("올바른 숫자를 입력하세요.");
                sc.nextLine(); // 잘못된 입력을 버리고 버퍼 비우기
            }
        }

        System.out.println("이름을 입력하세요");
        System.out.print(">> ");
        String memberName = sc.nextLine();

        int ptCount = 0;
        while(true) {
            try {
                System.out.println("PT 횟수를 입력하세요");
                System.out.print(">> ");
                ptCount = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e){
                System.out.println("값을 다시 입력하세요");
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

        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, memberID);
            pstm.setInt(2, memberPW);
            pstm.setString(3, memberName);
            pstm.setInt(4, ptCount);

            int res = pstm.executeUpdate();
            if(res > 0){
                System.out.println("입력성공");
            } else {
                System.out.println("입력실패");
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
