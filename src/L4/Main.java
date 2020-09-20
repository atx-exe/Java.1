package L4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random rnd = new Random();
    public static Scanner scn = new Scanner(System.in);
    public static int side = 3;
    public static int dotsToWin = 3;
    public static char[][] map = new char[side][side];
    public static char dotX = 'X';
    public static char dotO = 'O';
    public static char dotFree = '\u00b7';

    public static void main(String[] args) {
        //1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку;
        //2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
        //3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
        //4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.

        //Game menu
        do {
            System.out.printf("\t%c%c%c Игра крестики-нолики %c%c%c\n", dotFree, dotFree, dotFree, dotFree, dotFree, dotFree);
            initMap();
            game();
            System.out.println("Играть снова? Нет(0)/Да(1)");
        } while (inpScn(0, 1) == 1);
    }

    private static void game() {
        //Set witch turn
        boolean isTurnSecond = false;
        printMap();
        do {
            if (!isTurnSecond) { //Ход выбранного игрока
                System.out.println("Ход игрока: " + dotX);
                setDotHuman(dotX);
            } else {
                System.out.println("Ход игрока: " + dotO);
                setDotAI(dotO);
            }
            printMap();
            if (isWin(isTurnSecond ? dotO : dotX)) { //Проверка победы
                System.out.println("Игрок " + (isTurnSecond ? "2 (" + dotO + ")" : "1 (" + dotX + ")") + " победил.");
                break;
            }
            if (isMapFull()) { //Проверка заполненности
                System.out.println("Ни чья");
                break;
            }
            isTurnSecond = !isTurnSecond; //Change turn
        } while (true);
    }

    private static void setDotHuman(char dot) {
        int i, j;
        do {
            System.out.println("Введите число, положение точки по горизонтали в промежутке от 1 до " + side);
            j = inpScn(1, side) - 1;
            System.out.println("Введите число, положение точки по вертикали в промежутке от 1 до " + side);
            i = inpScn(1, side) - 1;
        } while (map[i][j] != dotFree);
        System.out.println("Точка установлена: " + dot + " (" + (j + 1) + ":" + (i + 1) + ")"); //Где точка
        map[i][j] = dot;
    }

    private static void setDotAI(char dot) {
        int x = -1, y = -1;
        char testedDot = (dot == dotX) ? dotO : dotX;
        //Попытка победить перебором
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (isDotFree(i, j)) {
                    map[i][j] = dot;
                    if (isWin(dot)) {
                        x = i;
                        y = j;
                    }
                    map[i][j] = testedDot;
                    if (isWin(testedDot)) {
                        x = i;
                        y = j;
                    }
                    map[i][j] = dotFree;
                }
            }
        }
        if (x == -1 && y == -1) {
            setDotAIRandom(dot);
        } else map[x][y] = dot;
    }

    private static void setDotAIRandom(char dot) {
        int i, j;
        do {
            i = rnd.nextInt(side);
            j = rnd.nextInt(side);
        } while (!isDotFree(i, j));
        map[i][j] = dot;
    }

    private static boolean isWin(char dot) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                //Проверяем только точки игрока который ходит
                if (map[i][j] != dot) continue;
                //Проверка горизонтали
                if (checkLine(i, j, 0, 1, dot)) return true;
                //Проверка вертикали
                if (checkLine(i, j, 1, 0, dot)) return true;
                //Проверка диагонали \
                if (checkLine(i, j, 1, 1, dot)) return true;
                //Проверка диагонали /
                if (checkLine(i, j, -1, 1, dot)) return true;
            }
        }
        return false;
    }

    private static boolean checkLine(int ci, int cj, int vi, int vj, char dot) {
        if (cj + dotsToWin * vj > side || ci + dotsToWin * vi > side || ci + dotsToWin * vi < -1) return false;
        for (int i = 0; i < dotsToWin; i++) {
            if (map[ci + i * vi][cj + i * vj] != dot) return false;
        }
        return true;
    }

    private static boolean isDotFree(int i, int j) {
        return (map[i][j] == dotFree);
    }

    private static boolean isMapFull() {
        boolean result = true;
        for (char[] row : map) {
            for (char element : row) {
                if (element == dotFree) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static int inpScn(int min, int max) {
        int result;
        do {
            result = scn.nextInt();
        } while (result < min || result > max);
        return result;
    }

    public static void printMap() {
        for (int i = 0; i < map[1].length + 1; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void initMap() {
        for (int i = 0, mapLength = map.length; i < mapLength; i++) {
            for (int j = 0, rowLength = map[i].length; j < rowLength; j++) {
                map[i][j] = dotFree;
            }
        }
    }

    //    private static void setDotAI(char dot) {
//        char testedDot = (dot == dotX) ? dotO : dotX;
//        boolean setBlock = false;
//        boolean setWin = false;
//        //Попытка победить перебором
//        for (int i = 0; i < side; i++) {
//            for (int j = 0; j < side; j++) {
//                if (map[i][j] == dotFree) {
//                    map[i][j] = dot;
//                    if (isWin(dot)) {
//                        setWin = true;
////                        System.out.println("Победа по подбору");
//                        break;
//                    } else map[i][j] = dotFree;
//                }
//            }
//            if (setWin) break;
//        }
//        if (!setWin) {
//            for (int i = 0; i < side; i++) {
//                for (int j = 0; j < side; j++) {
//                    //Проверяем только точки игрока который ходит
//                    if (map[i][j] != testedDot) continue;
//                    //Проверка горизонтали
//                    if (checkBlockDot(i, j, 0, 1, testedDot, dot)) {
////                        System.out.println("Заблокировано по горизонтали из точки: " + i + ":" + j);
//                        setBlock = true;
//                        break;
//                    }
//                    if (checkBlockDot(i, j, 0, -1, testedDot, dot)) {
////                        System.out.println("Заблокировано по горизонтали из точки: " + i + ":" + j);
//                        setBlock = true;
//                        break;
//                    }
//                    //Проверка вертикали
//                    if (checkBlockDot(i, j, 1, 0, testedDot, dot)) {
////                        System.out.println("Заблокировано по вертикали из точки: " + i + ":" + j);
//                        setBlock = true;
//                        break;
//                    }
//                    if (checkBlockDot(i, j, -1, 0, testedDot, dot)) {
////                        System.out.println("Заблокировано по вертикали из точки: " + i + ":" + j);
//                        setBlock = true;
//                        break;
//                    }
//                    //Проверка диагонали \
//                    if (checkBlockDot(i, j, 1, 1, testedDot, dot)) {
////                        System.out.println("Заблокировано по диагонали \\ из точки: " + i + ":" + j);
//                        setBlock = true;
//                        break;
//                    }
//                    if (checkBlockDot(i, j, -1, -1, testedDot, dot)) {
////                        System.out.println("Заблокировано по диагонали \\ из точки: " + i + ":" + j);
//                        setBlock = true;
//                        break;
//                    }
//                    //Проверка диагонали /
//                    if (checkBlockDot(i, j, -1, 1, testedDot, dot)) {
////                        System.out.println("Заблокировано по диагонали / из точки: " + i + ":" + j);
//                        setBlock = true;
//                        break;
//                    }
//                    if (checkBlockDot(i, j, 1, -1, testedDot, dot)) {
////                        System.out.println("Заблокировано по диагонали / из точки: " + i + ":" + j);
//                        setBlock = true;
//                        break;
//                    }
//                }
//            }
//        }
//        //Если не нашли что блокировать, ставим точку случайно
//        if (!setBlock && !setWin) {
//            System.out.println("Выбран метод рандомной установки точки");
//            setDotAIRandom(dot);
//        }
//    }

//    private static boolean checkBlockDot(int ci, int cj, int vi, int vj, char testedDot, char dot) {
//        //Отбрасываем варианты проверки, если они выходят за пределы
//        if (ci + dotsToWin * vi > side || ci + dotsToWin * vi < -1 ||
//                cj + dotsToWin * vj > side || cj + dotsToWin * vj < -1) return false;
//        for (int k = 0; k < dotsToWin; k++) {
//            //Если последняя итерация - то проверяем, пустая ли ячейка и если да, то чтавим точку игрока
//            if (k == dotsToWin - 1 && isDotFree(ci + k * vi, cj + k * vj)) {
//                map[ci + k * vi][cj + k * vj] = dot;
//                return true;
//            }
//            if (map[ci + k * vi][cj + k * vj] != testedDot) return false;
//        }
//        return false;
//    }
}
