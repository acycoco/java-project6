package com.example.javaproject2.week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RightTrianglePrinter {

    private Printer printer; //인터페이스 구현체를 넣어주기 구체적인 구현은 ConsolePrinter가 담당, 제어의 역전 IOC
    //ConsolePrinter가 제어를 합니다.
    // System.out.   --> Console
    // BufferedWriter --> Console, File

    public RightTrianglePrinter(Printer printer) { //생성자를 통해 DI를 합니다. (IOC  --> DI)
        this.printer = printer;
    }

    public String makeALine(int h, int i) { //한줄 만들기
        return String.format("%s%s\n", "", "*".repeat(i));
    }


    public void printShape(int h) throws IOException { //
        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            lines[i] = makeALine(h, i + 1);

        }
        printer.print(lines);//인터페이스.메소드   인터페이스의 구현체를 통해 실행을 하게 됨
    }


    public static void main(String[] args) throws IOException {
        //RightTrianglePrinter rtp = new RightTrianglePrinter(new ConsolePrinter()); //여기서 생성자 파라미터에 무엇을 넣어주느냐에 따라서 하는 일이 달라짐
        //rtp.printShape(5);


    }
}