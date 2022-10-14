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
        int sexOrientation = user.getSexOrientation();
        ArrayList<User> usersFiltered = new ArrayList<>();

        for (int i = 0; i <= users.size(); i++) {
            if (users.get(i).getGender() == sexOrientation) {
                usersFiltered.add(users.get(i));
            }
        }
        return usersFiltered;
    }

    public ArralyList<User> filterAge(User user, ArrayList<User> users) {
        int age = user.getAge(); //
        ArrayList<User> usersFiltered = new ArrayList<>();

        for (int i = 0; i <= users.size(); i++) {
            if ((age >= users.get(i).getAge() - 5) && (age <= users.get(i).getAge() + 5)) {
                usersFiltered.add(users.get(i));
            }
        }
        return usersFiltered;
    }

    public ArralyList<User> filterLikes(User user, ArrayList<User> users) {
        ArrayList<User> userFiltered = new ArrayList<>();
        ArrayList<User> userFilteredGood = new ArrayList<>();
        ArrayList<User> userFilteredBad = new ArrayList<>();
        int good;

        for (int i = 0; i <= users.size(); i++) {
            good = 0;
            for (int k = 0; k <= users.get(i).getLikes.size(); k++) {
                for (int j = 0; j <= user.getLikes.size(); j++) {
                    if (users.get(i).getLikes.get(k) == user.getLikes.get(j)) {
                        good++;
                    }
                }
            }
            if (good >= 3) {
                userFilteredGood.add(users.get(i));
            } else {
                userFilteredBad.add(users.get(i));
            }
        }
        userFiltered.add
        return userFilteredGood + userFilteredBad;
    }

}
