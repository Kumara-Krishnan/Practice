package practice;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * Randomized Quick Sort
 *
 *
 *
 * @author kumara krishnan
 */
public class QuickSort {

    int p;
    int q;
    int r;

    public void printArray(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public void quickSort(int[] arr, int p, int r) {

        if (p < r) {
            q = randomizedPartition(arr, p, r);
            //System.out.println("p " + p + " q " + (q - 1));
            //System.out.println("q " + (q + 1) + " r " + r);
            quickSort(arr, q + 1, r);
            quickSort(arr, p, q - 1);
        }
    }

    public int randomizedPartition(int[] arr, int p, int r) {
        int t = (int) (Math.random() * (r - p + 1)) + p;
        int temp = arr[t];
        arr[t] = arr[p];
        arr[p] = temp;
        return partition(arr, p, r);
    }

    public int partition(int[] arr, int p, int r) {
        int i = p + 1;
        int temp;
        //System.out.println("fuck this shit");
        //System.out.println("p " + p + " r " + r);
        for (int j = i; j <= r; j++) {
            if (arr[j] < arr[p]) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        temp = arr[i - 1];
        arr[i - 1] = arr[p];
        arr[p] = temp;
        //printArray(arr);
        //System.out.println();
        //System.out.println("the pivot  " + (i - 1));
        return i - 1;
    }

    static int[] arr = {5, 4, 3, 2, 4, 5, 6, -1, 45, -24, 5, 3, 2};

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        qs.quickSort(arr, 0, arr.length - 1);
        qs.printArray(arr);
    }
}
