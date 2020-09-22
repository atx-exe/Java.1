package L7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (n < food) {
            food -= n;
            return true;
        }
        return false;
    }

    public void info() {
        System.out.println("Plate: " + food);
    }
}
