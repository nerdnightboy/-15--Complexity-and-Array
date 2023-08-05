/*
 * 1 - Write a program to print the sum of all the elements present on even indices in the given array. 
Input 1: arr[] = {3,20,4,6,9} 
Output 1: 16
Input 1: arr[] = {4,3,6,7,1} 
Output 1: 11
 */

import java.util.Scanner;
public class Array1Ques1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            i++;
        }

        System.out.println(sum);

        
    }
}