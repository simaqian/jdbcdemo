package smq.java1.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcde {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
    Class.forName("com.mysql.jdbc.Driver");
    //  静态方法：getConnection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "root");
        String sql = "update salarygrade set hisalary = 13000 where grade = 1";
        Statement statement = conn.createStatement();
        int count = statement.executeUpdate(sql);
        System.out.println(count);
        statement.close();
        conn.close();
    }
}
