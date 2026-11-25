package difference.arrays.arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class DifferenceArraysArrayLists {

    public static void main(String[] args) {
        System.out.println("Comparing Java Arrays and ArrayLists");
        System.out.println("-----------------------------------");

        // Arrays have a fixed length and can store primitive values.
        int[] arrayScores = {80, 90, 70};

        System.out.println("\nARRAY");
        System.out.println("Original scores: "
                + Arrays.toString(arrayScores));
        System.out.println("Array length: " + arrayScores.length);

        // Use square brackets to access or change an array element.
        // Indexing starts at 0, so index 1 is the second element.
        arrayScores[1] = 95;

        System.out.println("After changing index 1: "
                + Arrays.toString(arrayScores));

        // The original array cannot grow.
        // Create a larger array and copy the original values into it.
        int[] largerArray = Arrays.copyOf(
                arrayScores, arrayScores.length + 1);

        largerArray[largerArray.length - 1] = 85;

        System.out.println("New, larger array: "
                + Arrays.toString(largerArray));
        System.out.println("Original array length is still: "
                + arrayScores.length);

        // ArrayLists store objects.
        // Integer is the wrapper class for the primitive type int.
        ArrayList<Integer> listScores = new ArrayList<>();

        // Unlike an array, an ArrayList manages its capacity automatically.
        listScores.add(80);
        listScores.add(90);
        listScores.add(70);

        System.out.println("\nARRAYLIST");
        System.out.println("Original scores: " + listScores);
        System.out.println("List size: " + listScores.size());

        // Use set() to change an ArrayList element.
        listScores.set(1, 95);

        System.out.println("After changing index 1: " + listScores);

        // Adding an element increases the list's size.
        listScores.add(85);

        System.out.println("After adding 85: " + listScores);
        System.out.println("New list size: " + listScores.size());

        // Removing index 0 shifts the remaining elements to the left.
        listScores.remove(0);

        System.out.println("After removing index 0: " + listScores);
        System.out.println("Size after removal: " + listScores.size());

        System.out.println("\nACCESSING ELEMENTS");

        // Arrays use brackets; ArrayLists use get().
        System.out.println("First array score: " + arrayScores[0]);
        System.out.println("First ArrayList score: " + listScores.get(0));

        System.out.println("\nLOOPING THROUGH BOTH");

        // Enhanced for loops work with both structures.
        System.out.print("Array: ");
        for (int score : arrayScores) {
            System.out.print(score + " ");
        }

        System.out.print("\nArrayList: ");
        for (int score : listScores) {
            System.out.print(score + " ");
        }

        System.out.println();
    }
}