package L6;

import L6.animal.Cat;
import L6.animal.Dog;

public class Main {
    public static void main(String[] args) {
        //1. Создать классы Собака и Кот с наследованием от класса Животное.
        //2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
        //3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
        //4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
        //5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

        Cat cat = new Cat("Barsik");
        Dog dog = new Dog("Tuzik", 300);
        Dog dog2 = new Dog("Palkan", 600);

        System.out.println(cat.getName() + " " + cat.run(299));
        System.out.println(cat.getName() + " " + cat.run(199));
        System.out.println(cat.getName() + " " + cat.run(99));
        System.out.println(dog.getName() + " " + dog.run(220));
        System.out.println(dog.getName() + " " + dog.run(100));
        System.out.println(dog2.getName() + " " + dog2.run(220));
        System.out.println(dog2.getName() + " " + dog2.run(100) + "\n");

        System.out.println(cat.getName() + " " + cat.jump(2));
        System.out.println(cat.getName() + " " + cat.jump(2.5));
        System.out.println(dog.getName() + " " + dog.jump(0.3));
        System.out.println(dog.getName() + " " + dog.jump(0.6) + "\n");

        System.out.println(dog.getName() + " " + dog.swim(9));
        System.out.println(dog.getName() + " " + dog.swim(30));
    }
}
