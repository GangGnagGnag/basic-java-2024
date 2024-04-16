package DTO;

import java.sql.*;

public class RegisterExercise extends ResChoice {
    public static void registerExercise() {

        System.out.print("회원 아이디를 입력하세요: ");
        String memberId = sc.nextLine();

        System.out.print("날짜 입력하세요(ex YY-MM-DD) : ");
        String dateday = sc.nextLine();

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PW)) {
            boolean continueRecording = true;
            while (continueRecording) {
                System.out.println("운동을 등록합니다. 종료하려면 'exit'을 입력하세요.");
                System.out.print("운동을 입력하세요 : ");
                String exercise = sc.nextLine();

                if (exercise.equalsIgnoreCase("exit")) {
                    continueRecording = false;
                } else {

                    System.out.print("무게를 입력하세요 : ");
                    int kg = sc.nextInt();
                    sc.nextLine();

                    System.out.print("세트 : ");
                    int setting = sc.nextInt();
                    sc.nextLine();

                    recordExercise(conn, memberId, exercise, kg, setting, dateday);

                }
            }

            decreaseMemberCount(conn, memberId);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void recordExercise(Connection conn, String memberId, String exercise, int kg, int setting, String dateday) {
        String sql = "INSERT INTO PT (memberId, dateday, exercise, kg, setting) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, memberId);
            pstmt.setString(2, dateday);
            pstmt.setString(3, exercise);
            pstmt.setInt(4, kg);
            pstmt.setInt(5, setting);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void decreaseMemberCount(Connection conn, String memberId) {
        String updateSql = "UPDATE MEMBER SET MEMBERCOUNT = MEMBERCOUNT - 1 WHERE MEMBERID = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(updateSql)) {
            pstmt.setString(1, memberId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}