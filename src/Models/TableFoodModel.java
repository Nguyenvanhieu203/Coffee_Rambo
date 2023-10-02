/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.Data.TableFood;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class TableFoodModel extends ConnectToSql {
    public List<TableFood> getTableByFloor (String floor){
        List<TableFood> listTable = new ArrayList<>();
        String query = "";
        if(floor == "Tất cả")   {
            query = "select Id, TableName from tableFoods";
            try{
            PreparedStatement prepare = con.prepareStatement(query);
            prepare.setString (1,floor);
            ResultSet result = prepare.executeQuery();
            
            while(result.next()){
                int id = result.getInt(1);
                String nameTable = result.getString(2);
                
                TableFood table = new TableFood (id,nameTable);
                listTable.add(table);
            }
            return listTable;
                    
            }catch(SQLException ex){
                ex.printStackTrace();
            }
            return null;
            }
        else  {
            query = "select Id, TableName from tableFoods where Floors = ?";
            try{
            PreparedStatement prepare = con.prepareStatement(query);
            prepare.setString (1,floor);
            ResultSet result = prepare.executeQuery();
            
            while(result.next()){
                int id = result.getInt(1);
                String nameTable = result.getString(2);
                
                TableFood table = new TableFood (id,nameTable);
                listTable.add(table);
            }
            return listTable;
                    
            }catch(SQLException ex){
                ex.printStackTrace();
            }
            return null;
        }
    }

    public String getTableName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
