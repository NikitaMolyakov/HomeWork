public class Cat extends Animal {
    private static final int MAX_RUN_DISTANCE = 200;
    private boolean isFull = false;

    public Cat() {
        super();
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать больше " + MAX_RUN_DISTANCE + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }

    public boolean eat(int foodAmount, Bowl bowl) {
        if (bowl.getFood() >= foodAmount) {
            bowl.decreaseFood(foodAmount);
            isFull = true;
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return isFull;
    }
}
