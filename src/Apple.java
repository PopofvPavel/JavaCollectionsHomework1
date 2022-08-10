public class Apple extends Fruit{
    public static double APPLE_WEIGHT = 1.0;

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                '}';
    }

    private String color;

    public Apple(String color) {
        this.color = color;
    }

    @Override
    public double getWeight() {
        return APPLE_WEIGHT;
    }
}
