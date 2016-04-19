/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * the counting sort - works only for elements from 0 to k.
 * 
 * @author kumara krishnan
 */
public class CountingSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] bArr = new int[arr.length];
        int[] c;
        
        //find max element in arr
        int k = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (k < arr[i]) {
                k = arr[i];
            }
        }
        k++;
        c = new int[k];
        
        //c[i] now contains no of elements equal to i.
        for (int i = 0; i < arr.length; i++) {
            c[arr[i]] = c[arr[i]] + 1;
        }

        //c[i] now contains no of elements less than or equal to i.
        for (int i = 1; i < k; i++) {
            c[i] = c[i] + c[i - 1];
        }
        
        //copy elements to bArr in sorted order.
        for (int i = arr.length - 1; i >= 0; i--) {
            c[arr[i]] = c[arr[i]] - 1;
            bArr[c[arr[i]]] = arr[i];
        }

        //print the elements in the sorted array
        for (int i : bArr) {
            System.out.print(i + " ");
        }
    }

}
