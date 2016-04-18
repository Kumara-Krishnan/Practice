/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author kumara krishnan
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    int[] arr = {5, 4, 3, 2, 1};
    int p = 0, r = arr.length - 1;

    private void mergeSort() {
        merge(arr, 0, arr.length - 1);
    }

    private void merge(int[] arr, int p, int r) {
        int q;
        if (p < r) {
            q = (p + r) / 2;
            merge(arr, p, q);
            merge(arr, q + 1, r);
            mergeimp(arr, p, q, r);
        }
    }

    private void mergeimp(int[] arr, int p, int q, int r) {
        int[] left = new int[q - p + 1];
        int[] right = new int[r - q];
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[p + i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[q + i + 1];
        }
        int i = 0, j = 0;
        for (int k = p; k <= r; k++) {
            if (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    arr[k] = left[i];
                    i++;
                } else {
                    arr[k] = right[j];
                    j++;
                }
            } else {
                if (i < left.length) {
                    arr[k] = left[i];
                    i++;
                } else if (j < right.length) {
                    arr[k] = right[j];
                    j++;
                }
            }
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        ms.mergeSort();
        ms.display();
    }

    private void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
