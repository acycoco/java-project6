package com.example.javaproject2.new2;

public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.run();
        bird.makeSound();
        Ani bird2 = new Bird(); //makeSound밖에 사용하지 못함


        Ani bir = new Bird();        //Q.똑같은 행위를 보장하지만  makeSound만 사용가능한 것인가요?
        Ani test = new Test();      //추상화된 어떤 것에 의존을 하고, new구현체 타입은 추상화된 어떤 것이기 때문에 추상화된 것의 메서드의 동일성을 보장합니다. dip를 지킬 수 있습니다.
        bird.makeSound();
        test.makeSound();       //Ani로 구현되어서 둘은 똑같은 행위를 한다는게 보장이 됩니다.
        //결과적으로, 동일한 행위를 보장을 하기위해서 인터페이스를 사용합니다.


        Bird bi = new Bird();  //구현체(클래스)에 의존을 하게 되어서 객체지향 설계에 맞지 않습니다.
        Test te = new Test();
        bi.makeSound();
        te.makeSound();       //각각이라서 무슨 행위를 할 줄 모릅니다.

    }
}
