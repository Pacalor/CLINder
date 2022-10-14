/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.clinder;

import java.util.ArrayList;

/**
 *
 * @author pcorrale
 */
public class Filters {

    public Filters() {
    }

    public ArrayList<User> filterSex(User user, ArrayList<User> users) {
        int sexOrientation = user.getSexOrientation(); //
        ArrayList<User> usersGood = new ArrayList<>(); //nombre a cambiar

        for (int i = 0; i <= users.size(); i++) {
            if (users.getGender() == sexOrientation) {
                usersGood.add(users.get(i));
            }
        }
        return usersGood;
    }

    public ArralyList<User> filterLikes(User user, ArrayList<User> users) {
        ArrayList<User> firstFilter = new ArrayList<>();
        firstFilter.add(FilterSex(user, users));
        int Good;

        for (int i = 0; i <= firsFilter.size(); i++) {
            for (int k = 0; i <= firstFilter; k++) {
                for (int j = 0; j<= user.getLikes.size()){
                    
                }
            }
        }

    }

}
