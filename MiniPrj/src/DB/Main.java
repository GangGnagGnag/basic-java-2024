package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            // 회원 테이블 조회
            String memberQuery = "SELECT * FROM MEMBER";
            try (PreparedStatement statement = connection.prepareStatement(memberQuery)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    String memberId = resultSet.getString("MemberId");
                    String memberName = resultSet.getString("MemberName");
                    int memberCount = resultSet.getInt("MemberCount");
                    System.out.println("Member ID: " + memberId + ", Name: " + memberName + ", Member Count: " + memberCount);
                }
            }

            // 매니저 테이블 조회
            String managerQuery = "SELECT * FROM MANAGER";
            try (PreparedStatement statement = connection.prepareStatement(managerQuery)) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    String managerId = resultSet.getString("MANAGER_ID");
                    String managerName = resultSet.getString("MANAGER_NAME");
                    System.out.println("Manager ID: " + managerId + ", Name: " + managerName);
                }
            }
        }  catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

