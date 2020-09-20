package L5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private int tel;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, int tel, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println(fullName + " " + position + " " + email + " " + tel + " " + salary + " " + age);
    }
}
