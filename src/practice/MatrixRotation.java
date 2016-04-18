package practice;

import java.util.Scanner;

/**
 *
 * Rotate the matrix to 90,180,270 and 360 degrees.
 *
 * @author kumara krishnan
 */
public class MatrixRotation {

    int m, n;
    int[][] arr;
    int[][] tArr, tArr1;
    int choice;
    boolean flag = true;

    public void getData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        m = scan.nextInt();
        n = scan.nextInt();
        arr = new int[m][n];
        tArr = new int[n][m];
        tArr1 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        while (flag) {
            System.out.println("Enter your choice");
            System.out.println("1. 90 degree");
            System.out.println("2. 180 degree");
            System.out.println("3. 270 degree");
            System.out.println("4. 360 degree");
            System.out.println("5. Exit");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    rotate(1, arr);
                    System.out.println("The original array is");
                    printArray(arr);
                    System.out.println("the array after 90 degree rotation");
                    printArray(tArr);
                    break;
                case 2:
                    rotate(2, arr);
                    System.out.println("The original array is");
                    printArray(arr);
                    System.out.println("the array after 180 degree rotation");
                    if (m == n) {
                        printArray(tArr);
                    } else {
                        printArray(tArr1);
                    }
                    break;
                case 3:
                    rotate(3, arr);
                    System.out.println("The original array is");
                    printArray(arr);
                    System.out.println("the array after 270 degree rotation");
                    printArray(tArr);
                    break;
                case 4:
                    System.out.println("The original array is");
                    printArray(arr);
                    System.out.println("the array after 360 degree rotation");
                    printArray(arr);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    public void rotate(int choice, int[][] arr) {
        if (m == n) {
            copyt2a(tArr1, arr);
            while (choice != 0) {
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        tArr[j][n - 1 - i] = tArr1[i][j];
                    }
                }
                copyt2a(tArr1, tArr);
                choice--;
            }
        } else {
            copyt2a(tArr1, arr);
            if (choice == 1) {
                for (int i = 0; i < tArr1.length; i++) {
                    for (int j = 0; j < tArr1[0].length; j++) {
                        tArr[j][tArr[0].length - 1 - i] = tArr1[i][j];
                    }
                }
            } else if (choice == 2) {
                for (int i = 0; i < tArr1.length; i++) {
                    for (int j = 0; j < tArr1[0].length; j++) {
                        tArr1[m - 1 - i][n - 1 - j] = arr[i][j];
                    }
                }
            } else if (choice == 3) {
                for (int i = 0; i < tArr1.length; i++) {
                    for (int j = 0; j < tArr1[0].length; j++) {
                        tArr[j][i] = arr[i][j];
                    }
                }
            }
        }
    }

    private void printArray(int[][] tArr) {
        for (int i = 0; i < tArr.length; i++) {
            for (int j = 0; j < tArr[0].length; j++) {
                System.out.print(tArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixRotation mr = new MatrixRotation();
        mr.getData();
    }

    private void copyt2a(int[][] a, int[][] b) {
        /*System.out.println(b.length);
         System.out.println(b[0].length);
         System.out.println(a.length);
         System.out.println(a[0].length);*/
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                a[i][j] = b[i][j];
            }
        }
    }

}
