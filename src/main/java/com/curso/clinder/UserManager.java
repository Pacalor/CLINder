/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.clinder;

import java.util.HashMap;

/**
 *
 * @author abzambra
 */
public class UserManager {
    
     HashMap<String, User> users;
    
    public UserManager() {
        users = new HashMap<>();
    }
    
    public void newUser(User u){
        users.put(u.name, u);
    }
    
    public boolean connect(String name, String pass){
        return users.containsKey(pass);
    }

    public HashMap<String, User> getUsers() {
        return users;
    }
    
    //Comparo las contraseñas 
    
    
    
    
}
