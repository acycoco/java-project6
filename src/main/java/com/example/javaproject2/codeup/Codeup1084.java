package com.example.javaproject2.codeup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //O : 한글자씩 읽음 , B : 한줄씩 읽음
        //println , printf -->자동차에 타는 시간

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                String Line = "";
                for (int k = 0; k < b; k++) {
                    Line += i + " " + j + " " + k + "\n";
                    cnt++;
                }
                bw.write(Line);
                bw.flush();
            }
        }
        System.out.println(cnt);
    }
}

