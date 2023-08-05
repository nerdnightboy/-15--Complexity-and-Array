/*
 *  Q2. write a program to print the elements above the secondary diagonal in a user inputted
square matrix.		
 */

import java.util.Scanner;

public class Array2Ques2 {
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
        System.out.println("Elements of secondary diagonal are : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i+j < m-1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
