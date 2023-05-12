
package com.example.javaproject2.week4.day4;

import com.example.javaproject2.week4.day4.parser.Parser;
import com.example.javaproject2.week4.day5.LineReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
/*
public class ReadFileEx {
    LineReader lineReader;
    Charset charset;
    Parser<T> parser;

    public ReadFileEx(Charset charset) {
        this.charset = charset;
    }

    public List<T> getLines(String fileName){


        List<T> lines = new LinkedList<>();
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(fileName), charset)){

            String line;
            while ((line = br.readLine()) != null) {
                lines.add(parser.parse(line));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
    public static void main(String[] args) throws IOException {

        ReadFileEx rfe = new ReadFileEx(StandardCharsets.UTF_8);
        List<T> result = rfe.getLines("hospital_info_10lines.csv");

        for (int i = 0; i < 9; i++) {
            result.get(i));
            System.out.printf("%s %s\n");
        }


    }
}
*/
