import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        String[] strArray = {"gg", "wp", "AB"};

        System.out.println("Before swap:");
        for (String str : strArray) {
            System.out.println(str);
        }

        swapArrayElements(strArray, 1, 2);

        System.out.println("After swap:");
        for (String str : strArray) {
            System.out.println(str);
        }

        ArrayList<String> arrayList = toArrayList(strArray);
        System.out.println(arrayList.toString());

        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green"));
        apples.add(new Apple("yellow"));
        apples.add(new Apple("red"));
        ArrayList<Apple> apples2 = new ArrayList<>();
        apples2.add(new Apple("GREEN"));
        apples2.add(new Apple("YELLOW"));
        //apples2.add(new Orange("GREEN"));/not working
        //apples.add(new Orange("orange"));
        Box box = new Box<>(apples);
        Box box2 = new Box<>(apples2);
        //box.add(new Orange("green"));

        System.out.println(box.compare(box2));


        box.pourOver(box2);
        System.out.println(box);

    }

    public static <T> ArrayList<T> toArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void swapArrayElements(Object[] array, int index1, int index2) {
        Object temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }
}
