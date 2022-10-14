/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.clinder;

/**
 *
 * @author dpadilla
 */
public enum Gender {
    MALE(1),
    FEMALE(2),
    NB(0);
    
    
    private int value;

    private Gender(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
}
