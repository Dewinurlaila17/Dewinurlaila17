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
public class user {
    private String username;
    private String password;
    
    public void SetUsername(String username){
        this.username = username;
    }
    public void SetPassword(String password){
        this.password = password;
    }
    
    public String GetUsername(){
        return this.username;
    }
    
    public String GetPassword(){
        return this.password;
    }
}

