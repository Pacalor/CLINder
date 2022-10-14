/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.clinder;

/**
 * Enum with all the posible likes
 * @author dpadilla
 */
public enum Likes {
    FLOWERS(1),
    DOG(2),
    CAT(3),
    FUTBOL(4),
    DRINK(5),
    ALCOHOL(6),
    PARTY(7),
    LOVE(8)
    ;
    
    private int value;

    private Likes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    /**
     * Method that allow you yo know if a number is a Like
     * @param like to test with all my data
     * @return true if it is a Like, false if not
     */
    public boolean isALike(int like){
        boolean found=false;
        Likes[] likes=Likes.values();
        for (Likes likeData : likes) {
            if(likeData.getValue()==like)found=true;
        }
        
        return found;
    }
    
}
