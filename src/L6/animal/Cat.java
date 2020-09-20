package L6.animal;

import java.util.Random;

public final class Cat extends Animal {

    public Cat(String name) {
        Random random = new Random();

        this.name = name;
        jumpHeight = 2;
        runDistance = (random.nextInt(2) + 1) * 100;
    }

    @Override
    public String run(int distance) {
        return ("run: " + (runDistance >= distance));
    }

    @Override
    public String jump(double height) {
        return ("jump: " + (jumpHeight >= height));
    }
}
