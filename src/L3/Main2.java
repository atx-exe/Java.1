package L3;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static Random rnd = new Random();
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        //2. * Игра Слова
        //Создать массив из слов
        //String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        //сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если
        //слово не угадано, компьютер показывает буквы которые стоят на своих местах.
        //apple – загаданное
        //apricot - ответ игрока
        //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        //Для сравнения двух слов посимвольно, можно пользоваться:
        //String str = "apple";
        //str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        //Играем до тех пор, пока игрок не отгадает слово
        //Используем только маленькие буквы

        String[] wordsArray = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};
        String hiddenWord;
        String testWord;
        hiddenWord = wordsArray[rnd.nextInt(wordsArray.length)];
        //System.out.println("Hidden word is " + hiddenWord); // Show Hidden word
        System.out.println("Загаданно овощ или фрукт. Все слова на английском в строчном " +
                "формате.");
        do {
            System.out.println("Введите слово:");
            testWord = scn.nextLine();
            if (testWord.equals(hiddenWord)) {
                System.out.print(hiddenWord);
            } else {
                for (int i = 0; i < 15; i++) {
                    if (i < hiddenWord.length() && i < testWord.length()) {
                        if (testWord.charAt(i) == hiddenWord.charAt(i)) {
                            System.out.print(testWord.charAt(i));
                        }else System.out.print("*");
                    } else System.out.print("*");
                }
            }
        } while (!hiddenWord.equals(testWord));
        System.out.println("\nВы угадали загаданное слово. Это слово: " + hiddenWord);
    }

}
