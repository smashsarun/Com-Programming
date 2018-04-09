
package hw.Controller;

import hw.db.ConnectionManager;
import hw.model.Restaurant;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class RestaurantController {
    private Connection con;
    
    //CreateConnection
    public RestaurantController (String username, String psw) throws SQLException, ClassNotFoundException{
        con = ConnectionManager.createConnection("jdbc:derby://localhost:1527/Restaurant", username, psw);
    }
    
    //CloseConnection
    public void CloseRestaurantConnection() throws SQLException {
        ConnectionManager.closeConnection(con);
    }
    
    //CreateTable
    public void CreateRestaurantTable() throws SQLException{
        String sql = "create table restaurant"
                +"(nameOfOrder varchar(30),"
                +"numOfOrder varchar(2),"
                +"price varchar(4),"
                +"primary key(nameOfOrder))";
        System.out.println(sql+"...working...");
        
        Statement stmt = con.createStatement();
        stmt.executeUpdate(sql); //เอาคำสั่ง sql ไปทำงาน
        System.out.println("Create table successful!");
    }
    
    //DropTable
    public void DropRestaurantTable() throws SQLException {
        String sql = "drop table restaurant";
        System.out.println(sql+"...working...");
        
        Statement stmt = con.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Drop table successful!");
    }
    
    //InsertTable
    public int InsertCourse(Restaurant Menu) throws SQLException {
        String sql = "insert into restaurant(nameOfOrder, numOfOrder, price) values (" 
                + "'" + Menu.getNameOfMenu() + "' , '" + Menu.getNumOfOrder()+ "' , '"
                + Menu.getPrice() + "')";
        System.out.println(sql+"...working...");
        
        Statement stmt = con.createStatement();
        int insertedRec = stmt.executeUpdate(sql);
        System.out.println(insertedRec + " inserted successful!");
        return insertedRec;
    }
    
}
