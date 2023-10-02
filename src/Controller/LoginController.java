/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.LoginModel;
import Models.Data.Staff;

/**
 *
 * @author nguye
 */
public class LoginController extends Staff {
    private final LoginModel _loginModel;
    public LoginController(LoginModel loginModel) {
        _loginModel = loginModel;
    }
    //    Login Controller
    public boolean Login(Staff staff) {
        Boolean result = _loginModel.Login(staff);
        if(result) return true;
        return false;
    }
//    SignIn Controller
    public boolean SignUp(Staff staff) {
        Boolean result = _loginModel.SignUp(staff);
        if(result) return true;
        return false;
    }
//    Get FullName Staff
    public String GetFullNameStaff(String Email, String Password) {
        String Result = _loginModel.getStaffNameByAccount(Email, Password);
        if(Result != null || !"".equals(Result)) return Result;
        return null;
    }
}
