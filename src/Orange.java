public class Orange extends Fruit{
    public static double ORANGE_WEIGHT = 1.5;

    private String color;

    @Override
    public String toString() {
        return "Orange{" +
                "color='" + color + '\'' +
                '}';
    }

    public Orange(String color) {
        this.color = color;
    }

    @Override
    public double getWeight() {
        return ORANGE_WEIGHT;
    }
}
