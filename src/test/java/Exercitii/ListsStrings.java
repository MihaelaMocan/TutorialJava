package Exercitii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListsStrings {

    public static void main(String[] args) {
        largestElement();
        reverseAList();

    }

    private static void reverseAList() {
    }

    private static void largestElement() {
    }


    //1.Write a function that returns the largest element in a list.
    public static void largestElement(List<Integer> list) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(55);
        list1.add(43);
        int maxValue = 0;
        for (Integer i: list1) {
            if (i > maxValue) {
                maxValue = i;
            }
            System.out.println("The maximum value is: " + maxValue);
        }
    }



    //2.Write function that reverses a list, preferably in place.
    public static void reverseAList(List<Integer> lista) {
        List<Integer> listaInversata = new ArrayList<>();
        lista.add(4);
        lista.add(32);
        lista.add(75);
        lista.add(27);
        lista.add(41);
        Collections.reverse(listaInversata);
        System.out.println(listaInversata);
    }




    //3.Write a function that checks whether an element occurs in a list.

}
