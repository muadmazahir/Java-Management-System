/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Models;

/**
 *
 * @author It18070736
 */
public class Employee {
    private String EmpId;
    private String fName;
    private String lName;   
    private String email;
    private int ContactNo;
    private String jobTitle;
    private String Gender;
    private String Address;
    private String DOB;
   
    public Employee(String EmpId,String fName,String lName,String email,int ContactNo, String jobTitle,String Gender,String Address,String DOB )
    {
        this.EmpId=EmpId;
        this.fName=fName;
        this.lName=lName;
        this.email=email;
        this.ContactNo=ContactNo;
        this.jobTitle=jobTitle;
        this.Gender=Gender;
        this.Address=Address;
        this.DOB=DOB;
        
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String EmpId) {
        this.EmpId = EmpId;
    }

    public String getfName() {
        return fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContactNo() {
        return ContactNo;
    }

    public void setContactNo(int ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getlName() {
        return lName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }
    
    
    
}
