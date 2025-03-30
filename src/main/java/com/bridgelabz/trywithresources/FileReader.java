package com.bridgelabz.trywithresources;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;



public class FileReader {
    public static void main(String[] args){
        String sourcefile="D:\\bridgelabz-workspace\\java-exceptions\\src\\main\\java\\com\\bridgelabz\\trywithresources\\info.txt";
        try{
            BufferedReader reader= new BufferedReader(new java.io.FileReader(sourcefile));
            String line;
            while((line=reader.readLine())!= null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println("File not found");
        }
    }
}
