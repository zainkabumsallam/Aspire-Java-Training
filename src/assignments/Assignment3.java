package assignments;

import java.util.Arrays;

public class Assignment3 {

    private static void checkArray(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is either null or empty.");
            System.exit(0);
        }
    }

    private static int minValue(int[] array) {
        checkArray(array);
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    private static int[] maxValue(int[] array) {
        checkArray(array);
        int max = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return new int[]{max, index};
    }

    private static double avg(int[] array) {
        checkArray(array);
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    private static int[] sortDescending(int[] array) {
        int[] tempArray = Arrays.copyOf(array, array.length);
        int[] sortedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = maxValue(tempArray)[0];
            tempArray[maxValue(tempArray)[1]] = Integer.MIN_VALUE;
        }
        return sortedArray;
    }

    private static int[] sortAscending(int[] array) {
        int[] tempArray = Arrays.copyOf(array, array.length);
        int[] sortedArray = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            sortedArray[i] = maxValue(tempArray)[0];
            tempArray[maxValue(tempArray)[1]] = Integer.MIN_VALUE;
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] array = {-1, 20, 3, 7, -33, 62, 1};
        System.out.println("Minimum value in array = " + minValue(array));
        System.out.println("Maximum value in array = " + maxValue(array)[0]);
        System.out.println("Average of values in array = " + avg(array));
        System.out.println("Sorted array (descending) = " + Arrays.toString(sortDescending(array)));
        System.out.println("Sorted array (ascending) = " + Arrays.toString(sortAscending(array)));
    }
}
