package L6.animal;

public final class Dog extends Animal {
    private int swimDistance;

    public Dog(String name, int runDistance) {
        this.name = name;
        this.runDistance = runDistance;
        jumpHeight = 0.5;
        swimDistance = 10;
    }

    @Override
    public String run(int distance) {
        return ("run: " + (runDistance >= distance));
    }

    @Override
    public String jump(double height) {
        return ("jump: " + (jumpHeight >= height));
    }

    public String swim(int distance) {
        return ("swim: " + (swimDistance >= distance));
    }
}
