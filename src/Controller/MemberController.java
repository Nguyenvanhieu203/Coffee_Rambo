/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Data.Member;
import Models.MemberModel;
import java.util.List;

/**
 *
 * @author nguye
 */
public class MemberController {

    private final MemberModel _memberModel;
    public MemberController(MemberModel memberModel) {
        _memberModel = memberModel;
    }
    public List<Member> getAllmember() {
        List<Member> listResult = _memberModel.GetAllMember();
        if(listResult != null ) return listResult;
        return null;
    }
}
