/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Data.TableFood;
import Models.TableFoodModel;
import java.util.List;

/**
 *
 * @author nguye
 */
public class TableFoodController {

    private final TableFoodModel _tableFoodModel;
    public TableFoodController(TableFoodModel tableFoodModel) {
        _tableFoodModel = tableFoodModel;
    }
    
    public List<TableFood> GetTableFood(String floor) {
        List<TableFood> result = _tableFoodModel.getTableByFloor(floor);
        if(result == null ) return null;
        return result;
    }
}
