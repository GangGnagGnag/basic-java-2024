package DTO;

import java.sql.*;
import java.util.InputMismatchException;

public class Extention extends ResChoice {
    public static void extention(){
        try(Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PW)){
            // 사용자로부터 아이디 입력 받기
            System.out.print("회원 아이디를 입력하세요: ");
            String memberId = sc.nextLine();

            int memberPw = 0;
            while(true){
                try{
                    System.out.print("비밀번호를 입력하세요 : ");
                    memberPw = sc.nextInt();
                    break;
                } catch (InputMismatchException e ){
                    System.out.println("잘못된 입력입니다.");
                    sc.nextLine();
                }
            }

            int increaseCount = 0;
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


            String sql = "UPDATE MEMBER SET MEMBERCOUNT = MEMBERCOUNT + ? WHERE MEMBERID = ? AND MEMBERPW = ?";
            try(PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setInt(1, increaseCount);
                pstmt.setString(2, memberId);
                pstmt.setInt(3, memberPw);

                int rowsAffected = pstmt.executeUpdate();

                if(rowsAffected > 0){
                    System.out.println("회원의 PT 횟수가 증가했습니다.");
                } else{
                    System.out.println("해당 회원이 존재하지 않거나 비밀번호가 일치하지 않습니다.");
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}