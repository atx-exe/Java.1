package L3;

import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static Scanner sc = new Scanner(System.in);
    public static Random rn = new Random();

    public static void main(String[] args) {
        //1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
        //После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        byte numberOfAttempts = 3;
        do {
            System.out.println("Отгадайте число от 0 до 9 за 3 попытки");
            //Загадать число
            int hiddenNumber = rn.nextInt(10);
            System.out.printf("\tHidden number is %d\n", hiddenNumber); //delete
            for (int i = 1; i < numberOfAttempts + 1; i++) {
                //Попытки угадать
                System.out.printf("Попытка %d\n", i);
                if (gameProcess(hiddenNumber)) break;
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        } while (getNumberFromScanner(0, 1) == 1);
    }

    private static boolean gameProcess(int hiddenNumber) {
        int testNumber = attempt();
        if (hiddenNumber > testNumber) {
            System.out.println("Загаданное число больше, чем " + testNumber);
            return false;
        } else if (hiddenNumber < testNumber) {
            System.out.println("Загаданное число меньше, чем " + testNumber);
            return false;
        } else {
            System.out.println("Вы угадали!!! Загаданное число: " + hiddenNumber);
            return true;
        }
    }

    public static int attempt() {
        return getNumberFromScanner(0, 9);
    }

    public static int getNumberFromScanner(int min, int max) {
        int result;
        do {
            result = sc.nextInt();
        } while (result < min || result > max);
        return result;
    }
}
