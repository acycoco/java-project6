package com.example.javaproject2.week4.day1;

import java.util.Scanner;

public class RockPaperScissorUntilWin {
    public String play(int user, int computer) {


        if (user == 0 && computer == 1) {
            return "win";
        } else if (user == 1 && computer == 2) {
            return "win";
        } else if (user == 2 && computer == 0) {
            return "win";
        } else if (user == computer) {
            return "tie";
        } else {
            return "lose";
        }
    }

    public int stringToNum(String str){
        switch (str) {
            case "바위" : return 0;
            case "가위" : return 1;
            case "보" : return 2;
            default: throw new IllegalArgumentException("입력하신" + str + "은 없습니다.");
        }
    }

    public String numToString(int num) {
        switch (num) {
            case 0 : return "바위";
            case 1 : return "가위";
            case 2 : return "보";
        }
        return null;
    }

    public void doWhileWin() {
        Scanner sc = new Scanner(System.in);
        String result;
        do {
            System.out.println("가위바위보를 시작합니다.");
            System.out.println("가위, 바위, 보 중 하나를 입력해주세요.");
            int user = stringToNum(sc.next());
            int computer = (int) (Math.random() * 3);
            result = play(user, computer);
            System.out.printf("사용자: %s 컴퓨터: %s 결과: %s\n", numToString(user), numToString(computer), result);
        } while (!result.equals("win"));
    }


    public static void main(String[] args) {

        RockPaperScissorUntilWin rpsu = new RockPaperScissorUntilWin();
        rpsu.doWhileWin();
    }
}
