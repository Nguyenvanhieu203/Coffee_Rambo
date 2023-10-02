/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author nguye
 */
public class Staff implements Serializable {
    public static int iD = 100;
    public String firstName;
    public String lastName;
    public String fullName;
    public Date dob;
    public int phoneNumber ;
    public String Email ;
    public String passwordHas;
    public String gender;
    public Date hireDate;
    public double salary;
    public String position;

    public Staff(){
        
    }
    public Staff(String firstName, String lastName, String fullName, Date dob, int phoneNumber, String Email, String passwordHas, String gender, Date hireDate, double salary, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.Email = Email;
        this.passwordHas = passwordHas;
        this.gender = gender;
        this.hireDate = hireDate;
        this.salary = salary;
        this.position = position;
    }

    public static int getiD() {
        return iD;
    }

    public static void setiD(int iD) {
        Staff.iD = iD;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPasswordHas() {
        return passwordHas;
    }

    public void setPasswordHas(String passwordHas) {
        this.passwordHas = passwordHas;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
