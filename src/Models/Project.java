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
public class Project {
   private String projectId;
   private String projectName;
   private String CustomerID;
   private double EstimatedCost;
   
   
   public Project(String projectId,String projectName,String CustomerID,double EstimatedCost )
   {
      this.projectId=projectId;
      this.projectName=projectName;
      this.CustomerID=CustomerID;
      this.EstimatedCost=EstimatedCost;
      
   }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerName) {
        this.CustomerID = CustomerName;
    }

    public double getEstimatedCost() {
        return EstimatedCost;
    }

    public void setEstimatedCost(double EstimatedCost) {
        this.EstimatedCost = EstimatedCost;
    }
      
}
