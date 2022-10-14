/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.clinder;

import java.util.HashMap;
import javax.xml.stream.events.StartElement;

/**
 *
 * @author abzambra
 */
public class UserManager {

    String n;

    HashMap<String, User> users;

    public UserManager() {
        users = new HashMap<>();
    }

    public void newUser(User u) {
        users.put(u.getName(), u);
    }

    public HashMap<String, User> getUsers() {
        return users;
    }

    //Comparo las contraseñas 
    public boolean checkPass(String name, String pass){
    
        boolean ok= false;
        
        if (users.containsKey(name)){
            User toTest = users.get(name);
            ok = toTest.getPass().equals(pass);
        }
        return ok;
    }
    
    public User getUser(String name) {
        return users.get(name);
    }
}

    

