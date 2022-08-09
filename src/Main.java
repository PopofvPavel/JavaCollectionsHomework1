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
