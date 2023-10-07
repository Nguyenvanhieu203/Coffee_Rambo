/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.ValidateModel;

/**
 *
 * @author ADMIN
 */
public class ValiDateController {
    private final ValidateModel _validateModel;
    public ValiDateController( ValidateModel validateModel){
        _validateModel = validateModel;
    }
    
    public boolean validateEmail (String value) {
        Boolean result = _validateModel.validateEmailModel(value);
        if(result) return true;
        return false;
    }
    
    public boolean validatePass (String value) {
        Boolean result = _validateModel.validatePassModel(value);
        if(result) return true;
        return false;
    }
    
    public boolean validatePhone (String value) {
        Boolean result = _validateModel.validatePhoneModel(value);
        if(result) return true;
        return false;
    }
}
