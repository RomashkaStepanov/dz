import java.util.Scanner;

public class Domashka1 {
    public static void main(String[] args) {

        toCount();

        System.out.println(toCompare(4, 20 ));

        System.out.println(toReverse(123));

        leapYear(2010);

    }

    public static void variables(){
        //первое задание

        int one = 1;
        long two = 2000000000000000000L;

        byte three = 127;
        short four = 4444;

        double five = 5.55555555555555555555555555555;
        float six = 6.6f;

        char seven = '7';
        String eight = "Восемь";

        boolean nine = true;

    }

    public static float toCount() {

        //второе задание

        Scanner insertA = new Scanner(System.in);
        float a;
        Scanner insertB = new Scanner(System.in);
        float b;
        Scanner insertC = new Scanner(System.in);
        float c;
        Scanner insertD = new Scanner(System.in);
        float d;

        System.out.print("Введите значение а:");
        a = insertA.nextInt();
        System.out.print("Введите значение b:");
        b = insertB.nextInt();
        System.out.print("Введите значение c:");
        c = insertC.nextInt();
        System.out.print("Введите значение d:");
        d = insertD.nextInt();

        float answer = a * (b + (c / d));

        System.out.println("ответ - " + answer);

        return answer;

    }

    public static boolean toCompare (int a, int  b) {

        //третье задание

        return (a + b) > 10 && (a + b) <= 20;

    }

    public static String toReverse (int number) {

        // четверое задание

        if (number > 100 && number <999 ) {
            int firstNum = number / 100;
            int secomdNum = (number / 10) % 10;
            int thirdNum = number % 10;
            return "число наоборот " + thirdNum + secomdNum + firstNum;
        } else {
            return "неправильное число";
        }
    }

    public static void leapYear (int year) {

        //пятое задание

        if ((year % 400 == 0) || (!(year % 100 == 0) && (year % 4 ==0))) {
            System.out.println(year + " год - високосный");
            return;
        } else {
            System.out.println(year + " год - не високосный");
            return;
        }
    }

}

