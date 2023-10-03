/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.Data.Drink;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class MenuModel extends ConnectToSql {
    public List<Drink> showMenu(){
        
        List<Drink> listDrink = new ArrayList<>();
        String query = "select * from drinks";
        try{
            PreparedStatement prepare = con.prepareStatement(query); 
            ResultSet result = prepare.executeQuery();
            
            while(result.next()){
                listDrink.add(new Drink(result.getInt(1),
                        result.getInt(2),
                        result.getString(3),
                        result.getDouble(4)));
//                        result.getString(5);
            }
            return listDrink;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
