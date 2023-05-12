package com.example.javaproject2.week4.day4;

import com.example.javaproject2.week4.day5.LineReader;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FileInputStreamReader2 {
    Charset charset;

    public FileInputStreamReader2(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {//파일내용을 읽어와 반환
        List<String> lines = new LinkedList<>();  //String LinkedList인 lines 생성

        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));//파일을 지정된 문자 인코딩으로 읽는 BufferedReader 선언

        // 한줄씩 불러오기
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);//한 줄(line)을 lines에 추가해줍니다.
        }
        return lines; //lines를 반환
    }

    public Hospital parse(String str) { //파라미터로 전달받은 String(한줄)을 parse하는 메소드
        String[] splitted = str.split(","); //','를 기준으로 split을 해서 String배열 splitted에 저장
        Address address = new Address(splitted[10], splitted[5], splitted[7]); //해당되는 부분을 Address 객체 생성
        Hospital hospital = new Hospital(splitted[1], splitted[11], address); //해당되는 부분과 생성한 address로 Hospital 객체 생성
        return hospital; //생성한 hospital을 반환
    }

    public List<Hospital> getHospitals(List<String> lines){ //모든 파일 내용을 Hospital 객체로 만들어 list에 저장해서 반환
        List<Hospital> hospitals = new ArrayList<>(); //Hospital list 생성
        for (String line : lines){
            hospitals.add(parse(line)); //한줄씩 parse함수의 반환값(Hospital 객체)를 hospital에 add해줍니다.

        }
        return hospitals;
    }

    public static void main(String[] args) throws IOException {
        FileInputStreamReader2 rfe = new FileInputStreamReader2(Charset.forName("UTF-8"));//UTF-8인코딩 방식으로 객체 생성
        List<String> strLines = rfe.getLines("hospital_info_0920_utf8.csv");//getLines의 반환 값(파일 내용 ->String 리스트)을 strLines에 저장
        List<Hospital> parsedHospital = rfe.getHospitals(strLines);//getHospitals()를 이용해서 파일내용(strLines)을 Hospital list인 parsedHospital에 저장
        for (int i = 0; i < parsedHospital.size(); i++) {//parsedHospital에 잘 저장되었는지 확인해봅니다.
            Hospital hospital = parsedHospital.get(i); //parsedHospital에 저장된 처음부터 끝인덱스까지 순회합니다.
            System.out.printf("%s %s %s\n", hospital.getName(),hospital.getWebsiteAddress(), hospital.getAddress().getFullAddress());//저장된 hopital을 getter을 이용해서 병원이름, 웹사이트주소, full주소를 출력합니다.
        }
    }

}
