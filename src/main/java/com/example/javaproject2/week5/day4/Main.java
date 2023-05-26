package com.example.javaproject2.week5.day4;

public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.run();
        bird.makeSound();
        Ani bird2 = new Bird(); //makeSound밖에 사용하지 못함


        Ani bir = new Bird();        //Q.똑같은 행위를 보장하지만  makeSound만 사용가능한 것인가요?
        Ani test = new Test();
        bird.makeSound();
        test.makeSound();       //Ani로 구현되어서 둘은 똑같은 행위를 한다는게 보장이 됩니다.
        //결과적으로, 동일한 행위를 보장을 하기위해서 인터페이스를 사용합니다.


        Bird bi = new Bird();
        Test te = new Test();
        bi.makeSound();
        te.makeSound();       //각가이라서 무슨 행위를 할 줄 모릅니다.

    }
}
