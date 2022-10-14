/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.clinder;

import static com.curso.clinder.Constants.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author dpadilla
 */
public class Reader {

    private Scanner reader;
    private String fileName;

    public Reader(String file) {
        this.fileName = file;
    }

    public ArrayList<User> readFile() throws FileNotFoundException {
        ArrayList<User> fileUser = new ArrayList<>();

        File file = new File(fileName);
        reader = new Scanner(file);

        String line;
        String[] words;

        while (reader.hasNext()) {
            line = reader.nextLine();

            if (line != null) {
                words = line.split("\\Q" + SEPARE);

                /////////////////
                String pass = words[0];
                String userName = words[1];
                String age = words[2];
                String likes=words[3];
                String sexualOrentation=words[4];
                String gender=words[5];

                ///TODO 
                User toAdd = new User(userName, pass);
                toAdd.setAge(Integer.parseInt(age));
                toAdd.setGender(Integer.parseInt(gender));
                toAdd.setSexualOrientation(Integer.parseInt(sexualOrentation));
                
                fileUser.add(toAdd);
            }

        }
        reader.close();
        return fileUser;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    
}
