/** Class with static methods which implement basic sorting algorithms.
 * @autor Agapov Pavel
 * @version 1.01
 */
package ru.agapovp;

public abstract class Sort {

    /** Bubble sort
     * @param arr - One-dimensional unsorted integer array.
     */
    public static void bSort(int[] arr) {

        long start = System.nanoTime();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int b = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = b;
                }
            }
        }

        long stop = System.nanoTime();

        System.out.println("Spent time: " + (stop - start));
    }
}
