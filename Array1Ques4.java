/*
 *  Write a program to find out the second largest element in a given array. 

Input 1: arr[] = {34,21,54,65,43}

Output 1: 54


Input 1: arr[] = {4,3,6,7,1}

Output 1: 6

 */

import java.util.*;

public class Array1Ques4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        if (n < 2) {
            System.out.printf("Invalid Input");
            return;
        }

        Arrays.sort(arr);
        int val = arr[n-2];
        
        System.out.println("The second maximum element is : " + val);
    }
}
