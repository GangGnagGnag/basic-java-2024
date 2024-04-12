package Health;

import java.sql.*;

public class look {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.printf("JDBC Driver 로드 성공!! \n");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "ADER";
            String pw = "1234";
            conn = DriverManager.getConnection(url,user,pw);
            String sql = "SELECT * FROM HEALTH";

            Statement st = conn.createStatement();  // 문법
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                String MemberId = rs.getString("MemberId");
                int MemberPw = rs.getInt("MemberPw");
                String MemberName = rs.getString("MemberName");
                int MemberCount = rs.getInt("MemberCount");
                System.out.println(MemberId + MemberPw + MemberName + MemberCount);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
