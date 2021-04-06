/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Nazir Hassan
 */
public class Inventory {
    
    private String ItemID;
    private String Name;
    private int Quantity;
    private String Supplier;
    
    public Inventory(String ItemID,String Name,int Quantity,String Supplier)
    {
       this.ItemID=ItemID;
       this.Name=Name;
       this.Quantity=Quantity;
       this.Supplier=Supplier;
    }

    public String getItemID() {
        return ItemID;
    }

    public void setItemID(String ItemID) {
        this.ItemID = ItemID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }
    
}
