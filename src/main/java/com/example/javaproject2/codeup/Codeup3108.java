package com.example.javaproject2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Student implements Comparable<Student>{
    private String code;
    private int testId;
    private String name;

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Student s){
        return this.getTestId() - s.getTestId();
    }

}
public class Codeup3108 {
    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code, int testId, String name) {
        return new Student(code, testId, name);
    }

    private boolean isDuplicated(Student pStudent){   //이 메소드는 private로 만들 것!
        for (Student student: students){
            if(pStudent.getTestId()==student.getTestId()) return true;
        }
        return false;
    }
    private void addAStudent(Student student){
        if(!isDuplicated(student)){
            students.add(student);
        }
    }

    private void deleteAStudent(Student pStudent){
        for (Student student: students){
            if(pStudent.getTestId() == student.getTestId()){
                students.remove(student);
                break;
            }
        }

    }


    public void sortStudents(){
        Collections.sort(students);
    }

    public void printStudentIndex(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d %s\n",students.get(arr[i] -1).getTestId(), students.get(arr[i]-1).getName());
        }

    }


    public void printStudents(){
        for(Student student : students){
            System.out.printf("%d %s\n",student.getTestId(), student.getName());
        }

    }

    public void process(Student student){
        if (student.getCode().equals("I")) {
            addAStudent(student);
        } else {
            deleteAStudent(student);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Codeup3108 codeup3108 = new Codeup3108();

        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {

            Student student = codeup3108.makeAStudent(sc.next(), sc.nextInt(), sc.next());

            codeup3108.process(student);
        }
        codeup3108.sortStudents();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        codeup3108.printStudentIndex(arr);




    }

}
