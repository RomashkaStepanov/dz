import java.util.Arrays;

public class Domashka2 {
    public static void main(String[] args) {
        reverseArray(14);
        secondTask();
        multipleByTwo();
        minMax(12);
        cross();
    }

    public static void reverseArray(int i){
        System.out.println("Задание первое\n");
        int[] zeroOneArray = new int [i];

        for (int j = 0; j < zeroOneArray.length; j++) {
            int a = 0;
            int b = 2;
            int randomNumber = a + (int) (Math.random() * b);
            zeroOneArray[j] = randomNumber;
        }
        System.out.println("Исходный массив - " + Arrays.toString(zeroOneArray));

        for (int j = 0; j < zeroOneArray.length; j++) {
            if(zeroOneArray[j] == 1){
                zeroOneArray[j] = 0;
            }else if(zeroOneArray[j] == 0){
                zeroOneArray[j] = 1;
            }
        }
        System.out.println("Обратный массив - " + Arrays.toString(zeroOneArray));
    }

    public static void secondTask(){
        System.out.println("\nЗадание второе\n");
        int[] plusThreeArray = new int [8];

        for (int i = 0; i < 8; i++) {
            int a = 1;
            plusThreeArray[i] = a;
            for (int j = 1; j < 8; j++) {
                a = a + 3;
                plusThreeArray[j] = a;
            }

        }
        System.out.println(Arrays.toString(plusThreeArray));

    }

    public static void multipleByTwo(){

        System.out.println("\nЗадание третье\n");

        int[] thirdTaskArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println(Arrays.toString(thirdTaskArray));

        for (int i = 0; i < thirdTaskArray.length; i++) {
            if (thirdTaskArray[i] < 6) {
                thirdTaskArray[i] = thirdTaskArray[i] * 2;
            }
        }
        System.out.println("\n" + Arrays.toString(thirdTaskArray));
    }

    public static void minMax(int i){

        System.out.println("\nЗадание четвертое\n");

        int[] fourthTaskArray = new int[i];
        for (int j = 0; j < i; j++) {
            fourthTaskArray[j] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(fourthTaskArray));

        int max = fourthTaskArray[0];
        int min = fourthTaskArray[0];

        for (int c = 1; c < fourthTaskArray.length; c++) {
            max = Math.max(max, fourthTaskArray[c]);
            min = Math.min(min, fourthTaskArray[c]);
        }

        System.out.println("Минимальное значение массива - " + min + "\nМаксимальное значение массива - " + max);

    }

    public static void cross(){
        System.out.println("\nЗадание пятое, коряво но решил\n");
        int[][] crossArray = new int[10][10];
        for (int i = 0; i < crossArray.length; i++) {
            for (int j = 0; j < crossArray.length; j++) {
                crossArray[j][j] = 1;
                int reverse = (j - (crossArray.length - 1)) * (-1);
                crossArray[j][reverse] = 1;
                System.out.print(crossArray[i][j] + "  ");
            }
            System.out.println();
        }

    }

    /*public static boolean balanceCheck(){
        System.out.println("Шестое задание не осилил(((");
        boolean check = false;

        int[] randomArray = {1, 5, 3, 2, 6}; //new int[i];

        /*for (int j = 0; j < i; j++) {
            randomArray[j] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(randomArray));

        for (int f = 0; f < randomArray.length; f++) {
            int reverse = (f - (randomArray.length - 1)) * (-1);
            if (randomArray[f] + randomArray[++f] == randomArray[reverse] + randomArray[--reverse]);{
                check = true;
            }
        }
        System.out.println(check);
        return check;
    }*/

    /*public static void caesarСipher(int n, int i){

        System.out.println("\nСедьмое задание, не уверен, что правильно понял суть\n");

        int[] caesarCipherArray = new int[i];
        for (int j = 0; j < i; j++) {
            caesarCipherArray[j] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(caesarCipherArray));

        for (int f = 0; f < caesarCipherArray.length; f++) {
                //;

                if ( f < caesarCipherArray.length) {
                    int pos =  caesarCipherArray.length - (++n);
                    caesarCipherArray[pos] = caesarCipherArray[f] = caesarCipherArray[f + n] ;
                }
        }



        System.out.println(Arrays.toString(caesarCipherArray));
    }*/

}
