package sit.db;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.derby.jdbc.ClientDataSource;

public class ConnectionManager {
    public static Connection createConnection(String url,String username, String psw) throws ClassNotFoundException, SQLException{
        //load driver class and register driver class to DriverManager
        //Class.forName("org.apache.derby.jdbc.EmbeddedDriver"); ตั้ังแต่ 1.6 ไม่ต้องใส่ได้
        
        Connection cn = DriverManager.getConnection(url, username, psw);
        System.out.println("Driver class register successfully");
        return cn;
    }
    
    public static Connection createConnection(String fileName) throws FileNotFoundException, IOException, SQLException {
        FileReader dbPropFile = new FileReader(fileName);
        Properties dbProp = new Properties(); //ทำให้อ่านเป็น properties ได้
        dbProp.load(dbPropFile);
        String serverName = dbProp.getProperty("SERVER_NAME");
        String tempPort = dbProp.getProperty("SERVER_PORT");
        int serverPort = Integer.parseInt(tempPort); //เปลี่ยนStrignเป็นInt
        String dbName = dbProp.getProperty("DB_NAME");
        String dbUser = dbProp.getProperty("DB_USERNAME");
        String dbPsw = dbProp.getProperty("DB_PASSWORD");
        //set properties to datasource
        ClientDataSource ds = new ClientDataSource();
        ds.setServerName(serverName);
        ds.setPortNumber(serverPort);
        ds.setDatabaseName(dbName);
        ds.setPassword(dbPsw);
        ds.setUser(dbUser);
        //create connect database
        Connection cn = ds.getConnection();
        return cn;
    }
    
    public static void closeConnection(Connection cn) throws SQLException{
        cn.close();
    }
}
