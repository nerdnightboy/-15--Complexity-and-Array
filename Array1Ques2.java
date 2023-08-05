/*
 *  Write a program to traverse over the elements of the array using for each loop and print all even
elements.

Input 1: arr[] = {34,21,54,65,43}

Output 1: 34 54 


Input 1: arr[] = {4,3,6,7,1}

Output 1: 4 6
 */

import java.util.Scanner;

public class Array1Ques2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Printing all the even elements : ");
        for(int even : arr){
            if(even%2 == 0){
                System.out.print(even + " ");
            }
        }
    }
}
