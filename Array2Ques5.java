/*
 * Q5: Write a function which accepts a 2D array of integers and its size as arguments and
 displays the elements of middle row and the elements of middle column. Printing can 

be done in any order.

[Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]
 */

import java.util.Scanner;

public class Array2Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of row m : ");
        int m = sc.nextInt();
        System.out.println("Enter the length of column n : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of middle row and middle column are : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == m/2 || j == n/2) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
