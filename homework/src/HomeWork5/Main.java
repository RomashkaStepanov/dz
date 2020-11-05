package HomeWork5;

import HomeWork5.Animals;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Макс", 500, 0.5, 10);
        Dog dog2 = new Dog("Рекс", 400, 0.7, 12);
        Cat cat1 = new Cat("Васька", 200, 2.0);
        Cat cat2 = new Cat("Гоша", 210, 2.5);
        Horse hor1 = new Horse("Дарий", 1000, 3.0, 100);
        Horse hor2 = new Horse("Спирит", 2000, 2.0, 50);
        Bird bird1 = new Bird("Твити", 5, 0.2);
        Bird bird2 = new Bird("Кеша", 7, 0.1);

        Animals[] zoo = {dog1, dog2, cat1, cat2, hor1, hor2, bird1, bird2 };

        for (int i = 0; i < zoo.length; i++) {
            zoo[i].run(100);
            zoo[i].jump(0.7);
        }

        bird1.swim();

        dog2.swim(50);

        cat2.swim();

    }

}
