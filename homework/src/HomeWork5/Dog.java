package HomeWork5;

import HomeWork5.Animals;

public class Dog extends Animals {
    public Dog(String name, int maxRunLength, double maxJumpHeight, int maxSwimlength){
        super(name, maxRunLength, maxJumpHeight);
        this.maxSwimLength = maxSwimlength;
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

    protected void swim(int swimLength) {
        if (swimLength <= maxSwimLength){
            System.out.println(name + " проплыл " + swimLength + " метров ");
        }else {
            System.out.println(name + " не может уплыть так далеко :(");
        }
    }

}
