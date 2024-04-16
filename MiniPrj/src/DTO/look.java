package DTO;

import java.sql.*;

public class look extends ResChoice {
    public static void lookClass() {
        Connection conn = null;
        try {
            Class.forName(DB_DRIVER_NAME);
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PW);
            String sql = "SELECT * FROM MEMBER";

            Statement st = conn.createStatement();  // 문법
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                String MemberId = rs.getString("MEMBERID");
                int MemberPw = rs.getInt("MEMBERPW");
                String MemberName = rs.getString("MEMBERNAME");
                int MemberCount = rs.getInt("MEMBERCOUNT");

                System.out.println("\n=================회원 조회=================");
                System.out.println("이름: " + MemberName);
                System.out.println("비밀번호: " + MemberPw);
                System.out.println("회원번호: " + MemberId);
                System.out.println("남은 PT 횟수: " + MemberCount);
                System.out.println("==========================================");
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
