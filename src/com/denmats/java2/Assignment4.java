package com.denmats.java2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Assignment4 {

    public void randomFileAccess(){
        RandomAccessFile randomAccessFile = null;
        try {
            String text = "";
            randomAccessFile = new RandomAccessFile("C:\\Users\\matsuied\\Desktop\\napis.txt","r");
            long fileLength = randomAccessFile.length();
            randomAccessFile.seek(15464);
            long pointer = 0;

            while (pointer < fileLength){
                text += randomAccessFile.readLine()+"\n";
                pointer = randomAccessFile.getFilePointer();
            }
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
