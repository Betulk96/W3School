package learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Swapfunctiondeneme {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Bangalore");
        list.add("Delhi");
        list.add("Noida");
        list.add("Mumbai");
        System.out.println("List Before Swapping : " +list);
        Collections.swap(list, 0, 2);
        System.out.println("List after swapping : " +list);






        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        System.out.println("List before swapping - " + integerList);

        Collections.swap(integerList, 0, 3);

        System.out.println("List after swapping first and last element - " + integerList);



    }
}
