/*
 * Q1: Take m and n input from the user and m * n integer inputs from user and print the following:			
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0.

 */

import java.util.*;

public class Array2Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of row m : ");
        int m = sc.nextInt();
        System.out.println("Enter the length of column n : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int positive = 0;
        int negative = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 0) zero++;
                if(arr[i][j]%2 == 0) even++;
                if(arr[i][j]%2 != 0) odd++;
                if(arr[i][j] < 0) negative++;
                if(arr[i][j] > 0) positive++;
            }
        }
        System.out.println("Number of positive numbers : " + positive);
        System.out.println("Number of negative numbers : " + negative);
        System.out.println("Number of odd numbers : " + odd);
        System.out.println("Number of even numbers : " + even);
        System.out.println("Number of zeroes : " + zero);
    }
}
