package L7;

public class Cat {
    String name;
    int appetite;
    boolean well_fed = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void info() {
        System.out.println(name + ": " + ((well_fed) ? "Not hungry" : "hungry"));
    }

    public void eat(Plate plate) {
        System.out.println(name + " пытается поесть " + appetite + " еды");
        if (plate.decreaseFood(appetite)) well_fed = true;
    }
}
