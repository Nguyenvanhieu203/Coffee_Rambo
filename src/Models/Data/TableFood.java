/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Data;

/**
 *
 * @author nguye
 */
public class TableFood {
    private int iD;
    private int idFloor;
    private String tableName;

    public TableFood(){
        
    }
    public TableFood(int iD, String tableName) {
        this.iD = iD;
        this.tableName = tableName;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
}
