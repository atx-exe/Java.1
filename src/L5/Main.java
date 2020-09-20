package L5;

public class Main {
    public static void main(String[] args) {
        //1. Создать класс «Сотрудник» с полями: ФИО, должность, email, телефон, зарплата, возраст
        //2. Конструктор класса должен заполнять эти поля при создании объекта
        //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль
        //4. Создать массив из 5 сотрудников
        //4.1 Объявить массив
        //4.2 Задать объект для каждой ячейки массива
        //5. С помощью цикла вывести информацию о сотрудниках, чей возраст более 40 лет
        Employee[] staff = new Employee[5];
        staff[0] = new Employee("Peter","Director","piter@gmail.com",3001000,30000, 54);
        staff[1] = new Employee("Ann","Accountant","ann@gmail.com",3001002,5000, 46);
        staff[2] = new Employee("Jorge","Production director","jorge@gmail.com",3001001,12000, 52);
        staff[3] = new Employee("Kate","System Administrator","kate@gmail.com",3001003,6000, 31);
        staff[4] = new Employee("Jane","Sales Manager","jane@gmail.com",3001010,5000, 28);

        for (Employee employee : staff) {
            if (employee.getAge() > 39) employee.info();
        }
    }
}
