package com.example.javaproject2.week4.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DrawDiamond2 {
    public void writeFile(int h) throws IOException {
        String path = "C:\\Users\\MMBY777LUCKY\\IdeaProjects\\diamond.txt";
        File file = new File(path);

        try{
            if(file.createNewFile()){
                System.out.println("파일 생성완료");
            }else {
                System.out.println("파일 생성실패");
            }
        } catch(IOException e) {
            System.out.println("파일 생성 중 오류 발생");
            e.printStackTrace(); //해당 예외 정보를 출력
        }

        FileOutputStream fos = new FileOutputStream(file);
        fos.write(makeString(h).getBytes());

        fos.close();
    }
    public String makeString(int h) {
        int pivot = h / 2;
        String answer = "";
        for (int i = 0; i <= pivot; i++) {
            for (int j = 0; j < pivot - i; j++) {
                answer += "0";
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                answer += "*";
            }
            answer += "\n";

        }
        for (int i = pivot; i > 0; i--) {
            for (int j = 0; j < pivot - i +1; j++) {
                answer += "0";
            }
            for (int j = 0; j < i * 2 -1 ; j++) {
                answer += "*";
            }
            answer += "\n";
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {


        int h = 7;
        DrawDiamond2 dd2 = new DrawDiamond2();
        dd2.writeFile(h);


    }
}
