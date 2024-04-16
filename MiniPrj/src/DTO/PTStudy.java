package DTO;


import java.sql.*;

public class PTStudy extends ResChoice {

    public static void studyList() {
        System.out.print("회원 아이디를 입력하세요: ");
        String memberId = sc.nextLine(); // 사용자로부터 회원 아이디 입력 받음

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PW)) {
            String sql = "SELECT EXERCISE, DATEDAY, KG, SETTING FROM PT WHERE MEMBERID = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, memberId);
                ResultSet rs = pstmt.executeQuery();

                if (!rs.isBeforeFirst()) {
                    System.out.println("운동 기록이 없습니다.");
                } else {
                    System.out.println("\n====================================운동 기록====================================");
                    while (rs.next()) {
                        String dateday = rs.getString("DATEDAY");
                        String exercise = rs.getString("EXERCISE");
                        String kg = rs.getString("KG");
                        String setting = rs.getString("SETTING");
//                        System.out.println("날짜: " + dateday + " \t | \t 운동: "+ exercise + " \t | \t 무게: " + kg +
//                                "kg \t | \t 세트: " + setting + "set");
                        System.out.printf("날짜: %s \t | \t 운동: %s \t | \t 무게: %dkg \t | \t 세트: %dset\n",dateday,exercise,kg,setting);
                    }
                    System.out.println("===========================================================================");

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}