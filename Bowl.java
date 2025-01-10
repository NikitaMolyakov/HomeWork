public class Bowl {
    private int food;

    public Bowl(int initialFood) {
        this.food = Math.max(initialFood, 0); // Не допускаем отрицательное количество еды
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        food = Math.max(food - amount, 0); // Не допускаем отрицательное количество еды
    }

    public void addFood(int amount) {
        food += amount;
    }
}
