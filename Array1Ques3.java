/*
 * Write a program to calculate the maximum element in the array.

Input 1: arr[] = {34,21,54,65,43}

Output 1: 65


Input 1: arr[] = {4,3,6,7,1}

Output 1: 7
 */

import java.util.Scanner;

public class Array1Ques3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0; i < n-1; i++){
            if(arr[i] < arr[i+1]){
                max = arr[i+1];
            }else{
                max = arr[i];
            }
        }
        System.out.println("The maximum element is : " + max);
    }
}
