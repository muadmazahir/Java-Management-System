/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

/**
 *
 * @author Muad
 */
public class IDException extends Exception {
    
    
   @Override
   public String getMessage()
   {
       return "ID field cannot be empty";
   }
    
    
}
