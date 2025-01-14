public abstract class Animal {
    private static int count = 0;

    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance) {
    }

    public void swim(int distance){
    }
}

