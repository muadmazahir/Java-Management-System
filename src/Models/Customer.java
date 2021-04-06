/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Models;

/**
 *
 * @author It18070736
 */import java.util.*;
public class Customer {
    private String fName;
    private String lName;
    private String CustomerID;    
    private String email;
    private String Address;
    private String DOB;
    private String gender;
    
    public Customer(String fName,String lName, String CustomerID,String email,String Address, String DOB, String gender )
    {
       this.fName=fName; 
       this.lName=lName;
       this.CustomerID=CustomerID; 
       this.email=email;
       this.Address=Address;
       this.DOB=DOB;
       this.gender=gender;
       
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }


    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String Date) {
        this.DOB = Date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
