/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 * 
 * Partition algorithm for quick sort.
 * Works only for an array with distinct elements.
 * 
 */

/**
 *
 * @author kumara krishnan
 */
public class QSPartition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {4,2,1,6,3};
        int i=1;
        int temp;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < arr[0]) {
                temp=arr[j];
                arr[j] = arr[i];
                arr[i]=temp;
                i++;
            } 
        }
        temp=arr[i-1];
        arr[i-1]=arr[0];
        arr[0]=temp;
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

}
