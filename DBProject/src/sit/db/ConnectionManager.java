package sit.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    public static Connection createConnection(String url,String username, String psw) throws ClassNotFoundException, SQLException{
        //load driver class and register driver class to DriverManager
        //Class.forName("org.apache.derby.jdbc.EmbeddedDriver"); ตั้ังแต่ 1.6 ไม่ต้องใส่ได้
        System.out.println("Driver class register successfully");
        Connection cn = DriverManager.getConnection(url, username, psw);
        return cn;
    }
    
    public static void closeConnection(Connection cn) throws SQLException{
        cn.close();
    }
}
