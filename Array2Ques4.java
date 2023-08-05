/*
 * Write a program to find the largest element of a given 2D array of integers. 
 */

import java.util.Scanner;

public class Array2Ques4 {
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
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n-1; j++) {
                if(arr[i][j] < arr[i][j+1]){
                    max = arr[i][j+1];
                }
            }
        }
        System.out.println("The maximum value is : " + max);
    }
}
