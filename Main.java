public class Main {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(10);
        Cat[] cats = {new Cat(), new Cat(), new Cat()};

        for (Cat cat : cats) {
            if (cat.eat(5, bowl)) {
                System.out.println("Кот сыт.");
            } else {
                System.out.println("Коту не хватило еды.");
            }
        }

        System.out.println("Количество еды в миске: " + bowl.getFood());
        for (Cat cat : cats) {
            System.out.println("Кот сытый: " + cat.isFull());
        }

        Shape circle = new Circle(5, "Красный", "Черный");
        Shape rectangle = new Rectangle(4, 6, "Синий", "Зеленый");
        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Фиолетовый");

        circle.displayCharacteristics();
        rectangle.displayCharacteristics();
        triangle.displayCharacteristics();
    }
}

