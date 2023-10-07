/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.Data.Member;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author nguye
 */
public class MemberModel extends ConnectToSql {

    public List<Member> GetAllMember() {  
        List<Member> listCustomer = new ArrayList<>();
        String query = "select * from memberShip";
        try{
            PreparedStatement prepare = con.prepareStatement(query); 
            ResultSet result = prepare.executeQuery();
            
            while(result.next()){
                listCustomer.add(new Member(result.getInt(1),
                        result.getInt(2),
                        result.getString(3),
                        result.getDate(4),
                        result.getDouble(5),
                        result.getInt(6)));

                
            }
            return listCustomer;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
