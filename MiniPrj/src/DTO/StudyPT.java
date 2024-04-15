package DTO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudyPT extends ResChoice {
    public static void qwe() {

        System.out.print("회원 아이디를 입력하세요: ");
        String memberId = sc.nextLine();
        studypt(memberId);

        System.out.println("운동 기록");
        System.out.println(">> ");
        String pt1 = sc.nextLine();

        PTlist(memberId, pt1);

    }

    public static void studypt(String memberId) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PW)) {

            String sql = "UPDATE MEMBER SET MEMBERCOUNT = MEMBERCOUNT - 1 WHERE MEMBERID = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, memberId);

                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("회원의 PT 횟수가 차감되었습니다");
                } else {
                    System.out.println("해당 회원이 존재하지 않습니다.");
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void PTlist(String memberId, String pt1) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        int result = -1;
        try {
            Class.forName(DB_DRIVER_NAME);

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PW);

            String sql = "INSERT INTO PT VALUES (?, ?)";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, pt1);
            pstmt.setString(2, memberId);

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
