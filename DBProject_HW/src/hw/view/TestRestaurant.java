
package hw.view;

import hw.Controller.RestaurantController;
import hw.model.Restaurant;
import java.sql.SQLException;

public class TestRestaurant {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try{
            RestaurantController resCtrl = new RestaurantController("sit","sit");
            
            Restaurant rs1 = new Restaurant("Omelet",1,35);
            
            //resCtrl.CreateRestaurantTable();
            //resCtrl.DropRestaurantTable();
            resCtrl.InsertCourse(rs1);
            resCtrl.CloseRestaurantConnection();
        }
        catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }
        catch (ClassNotFoundException cnEx) {
            System.out.println(cnEx);
        }
    }
}
