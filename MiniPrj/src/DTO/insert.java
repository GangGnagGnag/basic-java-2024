package DTO;

import java.sql.*;

public class insert extends ResChoice {
    public static void insertClass() {
        System.out.println("전화번호를 입력하세요 ( - 포함!)");
        System.out.print(">> ");
        String memberID = sc.nextLine();
        System.out.println("비밀번호를 입력하세요 (ex 1234)");
        System.out.print(">> ");
        int memberPW = sc.nextInt();
        sc.nextLine();
        System.out.println("이름을 입력하세요");
        System.out.print(">> ");
        String memberName = sc.nextLine();
        System.out.println("PT 횟수를 입력하세요");
        System.out.print(">> ");
        int ptCount = sc.nextInt();
        sc.nextLine();

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "ADER";
        String pw = "1234";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, pw);
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
