package HomeWork5;

import HomeWork5.Animals;

public class Horse extends Animals {
    public Horse(String name, int maxRunLength, double maxJumpHeight, int maxSwimLength){
        super(name, maxRunLength, maxJumpHeight);
        this.maxSwimLength = maxSwimLength;
    }

    @Override
    protected void run(int runLength) {
        if (runLength <= maxRunLength){
            System.out.println(name + " пробежала " + runLength + " метров ");
        }else {
            System.out.println(name + " не может убежать так далеко :(");
        }
    }

    @Override
    protected void jump(double jumpHeigth) {
        if (jumpHeigth <= maxJumpHeight){
            System.out.println(name + " прыгнула на " + jumpHeigth + " метров ");
        }else {
            System.out.println(name + " не может прыгать так высоко :(");
        }
    }

    protected void swim(int swimLength) {
        if (swimLength <= maxSwimLength){
            System.out.println(name + " проплыла " + swimLength + " метров ");
        }else {
            System.out.println(name + " не может уплыть так далеко :(");
        }
    }
}
