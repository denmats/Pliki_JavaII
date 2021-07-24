package com.denmats.java2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment1 {

    private String filename;
    public Assignment1(String fn){
        this.filename = fn;
    }


    public void displayFile() {
        try{
            Scanner scanner = new Scanner(new File(this.filename));
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException ex){
            System.out.println("File is not found");
        }catch (NumberFormatException ex){
            System.out.println("Wrong format");
        }
    }


}
