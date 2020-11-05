package HomeWork5;

public abstract class Animals {

    protected String name;
    protected int maxRunLength;
    protected double maxJumpHeight;
    protected int maxSwimLength;

    public Animals(String name, int maxRunLength, double maxJumpHeight/*, int maxSwimlength*/){
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
        //this.maxSwimLength = maxSwimlength;
    }

    protected abstract void run(int runLength);
    protected abstract void jump(double jumpHeigth);
    //protected abstract void swim(int swimLength);


}
