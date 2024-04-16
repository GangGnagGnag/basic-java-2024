package DTO;

import java.sql.*;

public class RegisterExercise extends ResChoice {
    public static void registerExercise() {
        System.out.println("운동을 등록합니다. 종료하려면 'exit'을 입력하세요.");

        System.out.print("회원 아이디를 입력하세요: ");
        String memberId = sc.nextLine();

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PW)) {
            boolean continueRecording = true;
            while (continueRecording) {
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

                    recordExercise(conn, memberId, exercise, kg, setting);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void recordExercise(Connection conn, String memberId, String exercise, int kg, int setting) {
        String sql = "INSERT INTO PT (memberId, exercise, kg, setting) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, memberId);
            pstmt.setString(2, exercise);
            pstmt.setInt(3, kg);
            pstmt.setInt(4, setting);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}