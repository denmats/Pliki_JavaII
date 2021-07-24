package com.denmats.java2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment2 {
    private String filename;
    public Assignment2(String fn){
        this.filename = fn;
    }


    public void displaySumOfNumbers() {
        int sum = 0;
        try{
            Scanner scanner = new Scanner(new File(this.filename));
            while (scanner.hasNextLine()){
                String s = scanner.nextLine();
                int len = s.length();
                for (int i = 0; i < len; i++) {
                    sum += Integer.parseInt(String.valueOf(s.charAt(i)));
                }
            }
            System.out.println("Sum = "+ sum);
        }catch (FileNotFoundException ex){
            System.out.println("File is not found");
        }catch (NumberFormatException ex){
            System.out.println("Wrong format");
        }
    }
}
