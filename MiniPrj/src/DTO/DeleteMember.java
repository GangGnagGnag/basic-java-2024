package DTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;

public class DeleteMember extends ResChoice {
    public static void deleteMember() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PW)) {
            // 사용자로부터 아이디 입력 받기
            System.out.println("회원 아이디를 입력하세요");
            System.out.print(">> ");
            String memberId = sc.nextLine();

            int memberPw = 0; 
            while(true){
                try{
                    System.out.println("비밀번호를 입력하세요");
                    System.out.print(">> ");
                    memberPw = sc.nextInt();
                    break;
                } catch (InputMismatchException e ){
                    System.out.println("잘못된 입력입니다.");
                    sc.nextLine();
                }
            }

            // 회원 삭제 SQL 쿼리
            String deleteMemberSql = "DELETE FROM MEMBER WHERE MEMBERID = ? AND MEMBERPW = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(deleteMemberSql)) {
                pstmt.setString(1, memberId);
                pstmt.setInt(2, memberPw);

                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    // PT 테이블에서 해당 회원의 데이터 삭제
                    String deletePTSql = "DELETE FROM PT WHERE MEMBERID = ?";
                    try (PreparedStatement ptStmt = conn.prepareStatement(deletePTSql)) {
                        ptStmt.setString(1, memberId);
                        ptStmt.executeUpdate();
                    }

                    System.out.println("회원과 관련된 데이터를 삭제했습니다.");
                } else {
                    System.out.println("해당하는 회원이 없거나 비밀번호가 일치하지 않습니다.");
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}