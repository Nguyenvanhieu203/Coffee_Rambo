/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.Data.Drink;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class BillDetailModel extends ConnectToSql{
    public boolean addBillDetail(int idBill, List<Drink> drinks, List<Integer> quantity){
        try{
           for(int i = 0; i< drinks.size();i++){
               String query = "insert into BillDetail (Idbill, IdDrink,Quantity) values (?,?,?);";
               try{
                    PreparedStatement prepare = con.prepareStatement(query); 
                    prepare.setInt(1,idBill);
                    prepare.setInt(2,drinks.get(i).getiD());
                    prepare.setInt(3,quantity.get(i));
                    
                    int rowsAffected = prepare.executeUpdate();

                    if (rowsAffected < 0) {
                        return false;
                    }
                }catch(Exception ex){
                    ex.printStackTrace();
                }
           }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return true;
    }
    public int getRecentBill(){
        int id = 1;
        try {
            String query = "SELECT TOP 1 Id, IdTable, IdStaff, IdMemberShip, CreateDate, TotalPrice FROM Bills ORDER BY Id DESC;";
            
            // Tạo PreparedStatement
            PreparedStatement prepare = con.prepareStatement(query); 
            //Thực hiện truy vấn
            ResultSet result = prepare.executeQuery();
            if(result.next()){
                id = result.getInt("Id");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return id;
    }
    public static void main(String[] args ){
        int idBill = 5;
        List<Drink> drinkList = new ArrayList<>();
        
        Drink drink = new Drink();
        drink.setiD(1);
        drinkList.add(drink);
        
        Drink drink1 = new Drink();
        drink1.setiD(2);
        drinkList.add(drink1);
        
        Drink drink2 = new Drink();
        drink2.setiD(3);
        drinkList.add(drink2);
        System.out.print(drinkList.size());
        List<Integer> quantity = new ArrayList<>(Arrays.asList(2, 2, 3));
        BillDetailModel billDTai = new BillDetailModel();
        billDTai.addBillDetail(idBill,drinkList,quantity);
    }
}
