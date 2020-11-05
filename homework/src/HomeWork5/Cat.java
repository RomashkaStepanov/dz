package HomeWork5;

import HomeWork5.Animals;

public class Cat extends Animals {
    public Cat(String name, int maxRunLength, double maxJumpHeight){
        super(name, maxRunLength, maxJumpHeight);
    }

    @Override
    protected void run(int runLength) {
        if (runLength <= maxRunLength){
            System.out.println(name + " пробежал " + runLength + " метров ");
        }else {
            System.out.println(name + " не может убежать так далеко :(");
        }
    }

    @Override
    protected void jump(double jumpHeigth) {
        if (jumpHeigth <= maxJumpHeight){
            System.out.println(name + " прыгнул на " + jumpHeigth + " метров ");
        }else {
            System.out.println(name + " не может прыгать так высоко :(");
        }
    }

    protected void swim() {
        System.out.println(name + " не умеет плавать :(");
    }
}
