package L6;

import L6.animal.*;

public class Main {
    public static void main(String[] args) {
        //1. Создать классы Собака и Кот с наследованием от класса Животное.
        //2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
        //3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
        //4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
        //5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

        Cat cat = new Cat(200,2.2f);
        Dog dog = new Dog(400,200,0.8f);
        Dog dog2 = new Dog(320,180,1.4f);

        System.out.println(cat.getType() + " " + cat.run(299));
        System.out.println(cat.getType() + " " + cat.run(199));
        System.out.println(cat.getType() + " " + cat.run(99));
        System.out.println(dog.getType() + " " + dog.run(220));
        System.out.println(dog.getType() + " " + dog.run(100));
        System.out.println(dog2.getType() + " " + dog2.run(220));
        System.out.println(dog2.getType() + " " + dog2.run(100) + "\n");

        System.out.println(cat.getType() + " " + cat.jump(2f));
        System.out.println(cat.getType() + " " + cat.jump(2.5f));
        System.out.println(dog.getType() + " " + dog.jump(0.3f));
        System.out.println(dog.getType() + " " + dog.jump(0.6f) + "\n");

        System.out.println(dog.getType() + " " + dog.swim(9));
        System.out.println(dog.getType() + " " + dog.swim(30));
    }
}
