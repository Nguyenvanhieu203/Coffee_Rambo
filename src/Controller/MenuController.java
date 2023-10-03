/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Data.Drink;
import Models.MenuModel;
import java.util.List;

/**
 *
 * @author nguye
 */
public class MenuController {

    private final MenuModel _menuModel;
    public MenuController(MenuModel menuModel) {
        _menuModel = menuModel;
    }
    public List<Drink> getAllMenuDrink() {
        List<Drink> resultList = _menuModel.showMenu();
        if(resultList != null) return resultList;
    return null;
    }
    
    public void fillTypeDrinkForCombobox(String combobox){
        
    }
}
