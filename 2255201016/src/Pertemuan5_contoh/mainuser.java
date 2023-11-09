/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5_contoh;

/**
 *
 * @author WINDOWS
 */
public class mainuser {
    public static void main(String[]args){
        user saya = new user();
        
        saya.SetUsername("dewinr");
        saya.SetPassword("dewiiii");
        
        System.out.println("Username = " + saya.GetUsername());
        System.out.println("Password = " + saya.GetPassword());
    }
    
}
