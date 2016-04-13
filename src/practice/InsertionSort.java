/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * Insertion Sort O(n^2)
 *
 *
 * @author kumara krishnan
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int key;
        int j;

        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "  ");
        }
    }
}
