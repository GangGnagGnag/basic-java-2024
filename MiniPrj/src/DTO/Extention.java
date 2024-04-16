package DTO;

import java.sql.*;

public class Extention extends ResChoice {
    public static void extention(){
        try(Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PW)){
            // 사용자로부터 아이디 입력 받기
            System.out.print("회원 아이디를 입력하세요: ");
            String memberId = sc.nextLine();
            System.out.print("등록 횟수 : ");
            int increaseCount = sc.nextInt();
            sc.nextLine();

            String sql = "UPDATE MEMBER SET MEMBERCOUNT = MEMBERCOUNT + ? WHERE MEMBERID = ?";
            try(PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setInt(1, increaseCount);
                pstmt.setString(2, memberId);

                int rowsAffected = pstmt.executeUpdate();

                if(rowsAffected > 0){
                    System.out.println("회원의 PT 횟수가 증가했습니다.");
                } else{
                    System.out.println("해당 회원이 존재하지 않습니다.");
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}