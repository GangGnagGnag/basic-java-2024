package DB;

import java.sql.*;

public class look {
    final public static String DB_URL           = "jdbc:oracle:thin:@localhost:1521:xe";
    final public static String DB_DRIVER_NAME   = "oracle.jdbc.driver.OracleDriver";
    final public static String DB_USER          = "ADER";
    final public static String DB_PW            = "1234";
    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName(DB_DRIVER_NAME);
            System.out.printf("JDBC Driver 로드 성공!! \n");
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PW);
            String sql = "SELECT * FROM MEMBER";

            Statement st = conn.createStatement();  // 문법
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()){
                String MemberId = rs.getString("MemberId");
                int MemberPw = rs.getInt("MemberPw");
                String MemberName = rs.getString("MemberName");
                int MemberBir = rs.getInt("MemberBir");
                int MemberTel = rs.getInt("MemberTel");
                int MemberCount = rs.getInt("MemberCount");

                System.out.println(MemberId + "\t"+ MemberPw+ "\t" + MemberName+ "\t" + MemberBir +"\t"+ MemberTel +"\t" +MemberCount);
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
