/** Class with static methods which implement basic sorting algorithms.
 * @autor Agapov Pavel
 * @version 1.21
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

    /** Insertion sort
     * @param arr - One-dimensional unsorted integer array.
     */
    public static void insSort(int[] arr) {

        long start = System.nanoTime();

        for(int i = 1; i < arr.length; i++) {
           for(int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
               int b = arr[j - 1];
               arr[j - 1] = arr[j];
               arr[j] = b;
           }
       }

        long stop = System.nanoTime();

        System.out.println("Spent time: " + (stop - start));
    }

    /** Selection sort
     * @param arr - One-dimensional unsorted integer array.
     */
    public static  void selSort(int[] arr) {

        long start = System.nanoTime();
        
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int b = arr[i];
            arr[i] = arr[min];
            arr[min] = b;
        }

        long stop = System.nanoTime();

        System.out.println("Spent time: " + (stop - start));
    }
}