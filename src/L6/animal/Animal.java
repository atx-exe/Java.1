package L6.animal;

public abstract class Animal {
    protected String name;
    protected int runDistance;
    protected double jumpHeight;

    public String getName() {
        return name;
    }

    protected abstract String run(int distance);

    protected abstract String jump(double height);
}
