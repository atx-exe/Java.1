package L2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        byte[] task1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("task 1:\t");
        System.out.println("\t" + Arrays.toString(task1));
        System.out.println("\t" + Arrays.toString(task1(task1)));
        //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println("task 2:\t" + Arrays.toString(task2()));
        //3. Задать массив [1,5,3,2,11,4,5,2,4,8,9,1] пройти по нему циклом и числа меньшие 6 умножить на 2;
        int[] task3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("task 3:\t");
        System.out.println("\t" + Arrays.toString(task3));
        System.out.println("\t" + Arrays.toString(task3(task3)));
        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.print("task 4:\t");
        int side = 7;
        int[][] task4 = new int[side][side];
        task4(task4);
        for (int[] arri : task4) {
            System.out.print("\n\t");
            for (int j : arri) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] task5 = {8, 3, 0, 2, -3, 4, 6, 1, 4};
        System.out.println("task 5:\t" + Arrays.toString(task5));
        System.out.println("\tMin = " + task5Min(task5));
        System.out.println("\tMax = " + task5Max(task5));
        //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят.
        int[] task6 = {8, 2, 4, 4};
        System.out.println("task 6:\t" + Arrays.toString(task6));
        System.out.println("\tit array is balance? - " + task6(task6));
        //7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        int[] task7 = {1, 2, 3, 4, 5};
        int shift = -6;
        System.out.println("task 7:\t");
        System.out.println("\tshift: " + shift);
        System.out.println("\t"+Arrays.toString(task7(task7, shift)));
    }

    private static byte[] task1(byte[] task1) {
        byte[] result = new byte[task1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = (byte) ((task1[i] > 0) ? 0 : 1);
        }
        return result;
    }

    private static byte[] task2() {
        byte[] result = new byte[8];
        for (int i = 0; i < result.length; i++) {
            result[i] = (byte) (i * 3);
        }
        return result;
    }

    private static int[] task3(int[] task3) {
        for (int i = 0; i < task3.length; i++) {
            task3[i] = (task3[i] < 6) ? task3[i] * 2 : task3[i];
        }
        return task3;
    }

    private static void task4(int[][] task4) {
        for (int i = 0; i < task4.length; i++) {
            for (int j = 0; j < task4[i].length; j++) {
                task4[i][j] = (i == j) || (i + 1 == task4.length - j) ? 1 : 0;
            }
        }
    }

    private static int task5Max(int[] task5) {
        int result = task5[0];
        for (int i : task5) result = (i > result) ? i : result;
        return result;
    }

    private static int task5Min(int[] task5) {
        int result = task5[0];
        for (int i : task5) result = (i < result) ? i : result;
        return result;
    }

    private static boolean task6(int[] task6) {
        double result = 0;
        for (int i : task6) {
            result += i;
        }
        if (result % 2 != 0) return false;
        result /= 2;
        for (int i : task6) {
            result -= i;
            if (result == 0) {
                return true;
            }
        }
        return false;
    }

    private static int[] task7(int[] task7, int shift) {
        shift %= task7.length;
        if (shift < 0) shift += task7.length;
        for (int i = shift; i > 0; i--) {
            int buffer = task7[0];
            System.arraycopy(task7, 1, task7, 0, task7.length - 1);
            task7[task7.length - 1] = buffer;
        }
        return task7;
    }

}
