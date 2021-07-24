package com.denmats.java2;

import java.io.*;

public class Assignment3 {


    public void readFileAtOnce() {
        try{
            File file = new File("C:\\Users\\matsuied\\Desktop\\dane1.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()];
            fileInputStream.read(bytes);
            fileInputStream.close();

            String fileContent = new String(bytes, "UTF-8");
            display(fileContent);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private void display(String fileContent) {
        System.out.println(fileContent);
    }

}
