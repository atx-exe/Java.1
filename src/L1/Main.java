package L1;

public class Main {
    public static void main(String[] args) {
        //1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
        System.out.println("task 1:\tOK");
        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        task2();
        //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – входные параметры этого метода;
        int task3a, task3b, task3c, task3d;
        task3a = 3;
        task3b = 2;
        task3c = 6;
        task3d = 2;
        System.out.println("task 3:\t" + task3(task3a, task3b, task3c, task3d));
        //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        int task4a = 8;
        int task4b = 12;
        System.out.println("task 4:\t" + "Сумма " + task4a + " и " + task4b + " лежит в пределах от 10 до 20?: " + task4(task4a, task4b));
        //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        int task5 = -3;
        task5(task5);
        //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        int task6 = -3;
        System.out.println("task 6:\t" + task6(task6));
        //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        String task7 = "Name";
        task7(task7);
        //8. * Написать метод, который определяет является ли год високосным и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        int task8 = 400; //year
        System.out.println("task 8:\t" + task8 + " " + task8(task8));
    }

    private static void task2() {
        System.out.println("task 2:\t");
        byte b = 127;
        System.out.println("\tbyte b=" + b);
        short s = 32767;
        System.out.println("\tshort s=" + s);
        int i = 32;
        System.out.println("\tint i=" + i);
        long l = 64L;
        System.out.println("\tlong l=" + l + "L");
        float f = 32.0f;
        System.out.println("\tfloat f=" + f + "f");
        double d = 64.00;
        System.out.println("\tdouble d=" + d);
        boolean bool = true;
        System.out.println("\tboolean bool=" + bool);
        char ch = '\uffff';
        System.out.println("\tchar ch='\\\\uffff'=" + ch);
        String S = "String";
        System.out.println("\tString S=\"" + S + "\"");
    }

    private static int task3(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    private static boolean task4(int a, int b) {
        boolean result;
        final int sum = a + b;
        result = sum >= 10 && sum <= 20;
        return result;
    }

    private static void task5(int num) {
        if (num < 0) {
            System.out.println("task 5:\t" + num + " - отрицательное");
        } else System.out.println("task 5:\t" + num + " - положительное или 0");
    }

    private static String task6(int num) {
        String result;
        if (num < 0) {
            result = num + " - отрицательное";
        } else result = num + " - положительное или 0";
        return result;
    }

    private static void task7(String name) {
        System.out.printf("task 7:\t" + "Привет, %S!\n", name);
    }

    private static boolean task8(int year) {
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
