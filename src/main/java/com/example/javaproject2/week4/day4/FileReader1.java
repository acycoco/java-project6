package com.example.javaproject2.week4.day4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
    public String read(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        return line;
    }
    public static void main(String[] args) throws IOException {
        FileReader1 fr1 = new FileReader1();
        fr1.read("./hello.txt");

    }
}
