public interface Shape {
    double calculateArea();
    double calculatePerimeter();
    default void displayCharacteristics() {
        System.out.println("Периметр: " + calculatePerimeter() + ", Площадь: " + calculateArea() +
                ", Цвет заливки: " + getFillColor() + ", Цвет границы: " + getBorderColor());
    }

    String getFillColor();
    String getBorderColor();
}
