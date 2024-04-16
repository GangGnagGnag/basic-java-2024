package DTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteMember extends ResChoice {
    public static void deleteMember() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PW)) {
            // 사용자로부터 아이디 입력 받기
            System.out.print("회원 아이디를 입력하세요: ");
            String memberId = sc.nextLine();
            System.out.print("비밀번호를 입력하세요 : ");
            int memberPw = sc.nextInt();
            sc.nextLine();

            String sql = "DELETE FROM MEMBER WHERE MEMBERID = ? AND MEMBERPW = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, memberId);
                pstmt.setInt(2, memberPw);

                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("회원이 삭제되었습니다.");
                } else {
                    System.out.println("해당하는 회원이 없거나 비밀번호가 일치하지 않습니다.");
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}