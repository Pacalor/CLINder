/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.clinder;

import static com.curso.clinder.Constants.*;
import java.util.ArrayList;

/**
 *
 * @author abzambra
 */
public class User {
    
    private String pass;
    private String name;
    private int age;
    private ArrayList<Integer> pleasures;
    private int sexualOrientation;
    private int gender;
    

    public User(String pass, String name) {
        this.pass = pass;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Integer> getPleasures() {
        return pleasures;
    }

    public void setPleasures(ArrayList<Integer> pleasures) {
        this.pleasures = pleasures;
    }

    public int getSexualOrientation() {
        return sexualOrientation;
    }

    public void setSexualOrientation(int sexualOrientation) {
        this.sexualOrientation = sexualOrientation;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getPass() {
        return pass;
    }

    public String getName() {
        return name;
    }

    
    
    @Override
    public String toString() {
        String likes="";
        for (Integer pleasure : pleasures) {
            likes+=pleasure.toString()+LISTSEPARE;
        }
        
        String toWrite= pass + SEPARE + name + SEPARE + age + SEPARE + likes + SEPARE + sexualOrientation + SEPARE + gender;
        
        
        return  toWrite;
    }
    
    
    
    
}
