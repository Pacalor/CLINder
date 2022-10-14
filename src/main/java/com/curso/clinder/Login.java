/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.clinder;

import java.util.Scanner;

/**
 *
 * @author abzambra
 */
public class Login {

    private UserManager um;

    public Login() {
        um = new UserManager();
    }

    public User start() {
        int opt=1;
        boolean logout = true;
        User logged=null;
        
        while (logout && opt == 1 || opt == 2) {
            System.out.println("Hello. Do you want to :");
            System.out.println(
                    "1 - Registry ");
            System.out.println(
                    "2 - Log in");
            opt= new Scanner(System.in).nextInt();

            System.out.println(
                    "Introduce you username");
            String username = new Scanner(System.in).nextLine();

            System.out.println(
                    "Introduce you password");

            String pass = new Scanner(System.in).nextLine();

            

            switch (opt) {
                case 1 -> {
                    um.newUser(new User(username, pass));

                    System.out.println("Registred successful");

//                    System.out.println("Do you want to log in y/n?");
//                    String s = new Scanner(System.in).nextLine();
//
//                    if (s.equals("y")) {
//                        username = new Scanner(System.in).nextLine();
//
//                        pass = new Scanner(System.in).nextLine();
//
//                        um.checkPass(username, pass);
//                        System.out.println("Connected");
//                    } else {
//                        System.out.println("Credentials not satisfyed");
//                    }
//                    opt = 0;
                }
                case 2 -> {
                    if (um.checkPass(username, pass)) {
                        System.out.println("Connected");
                        logged = um.getUser(username);
                        logout = false;
                    } else {
                        System.out.println("Credentials not satisfyed");
                    }
                }

            }
        }
        return logged;
    }
}
