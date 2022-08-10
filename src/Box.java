import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;


    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public void add(T fruit){
        this.fruits.add(fruit);

    }

    public double getWeitht() {
        double weight = 0.0;
        for (T fruit : fruits) {
            weight += fruit.getWeight();

        }
        return weight;
    }

    public boolean compare(Box otherBox) {
        double otherBoxWeight = otherBox.getWeitht();
        double weight = getWeitht();
        return Math.abs(weight - otherBoxWeight) < 0.001;

    }
    public void pourOver(Box box){
        ArrayList<T> otherBoxFruits = box.getFruits();
        for(T fruit : otherBoxFruits){
            this.fruits.add(fruit);
        }
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruits=" + fruits.toString() +
                '}';
    }

}
