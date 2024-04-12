package DB;

import java.sql.*;

public class MemberTest {
    private static final String driver = "oracle.jdbc.driver.OracleDriver"; // 데이터베이스 URL
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; // 데이터베이스 URL
    private static final String USERNAME = "ADER"; // 데이터베이스 사용자 이름
    private static final String PASSWORD = "1234"; // 데이터베이스 비밀번호

    public static void main(String[] args) {
        Connection conn;
        Statement stmt;
        ResultSet rs;
        try {
            Class.forName(driver);
            System.out.println("로딩성공");
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("성공");

            stmt = conn.createStatement();
            System.out.println("성공");

            String query = "INSERT INTO MEMBER VALUES ('POCARI', 1234, '윤종훈', 951020, 01022223333,10 );";
            System.out.println(query);

            stmt.executeUpdate(query);
            String query2 = "SELECT * FROM MEMBER";
            System.out.println(query2);

            rs = stmt.executeQuery(query2);

            while (rs.next()) {
                System.out.print("아이디 > " + rs.getString("ID"));
                System.out.print("비밀 번호 > " + rs.getInt("PW"));
                System.out.print("이름 > " + rs.getString("NAME"));
                System.out.print("생년 월일 > " + rs.getInt("BIR"));
                System.out.print("전화 번호 > " + rs.getInt("TEL"));
                System.out.print("남은 횟수 > " + rs.getInt("COUNT"));
                System.out.println();
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
