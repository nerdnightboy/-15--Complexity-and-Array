/*
 * Given an array. Find the first peak element in the array. A peak element is an element that is greater than
its just left and just right neighbor.


Input 1: arr[] = {1,3,2,6,5}

Output 1: 6


Input 2:  arr[] = {1 4,7,3,2,6,5}

Output 1: 7
 */

import java.util.Scanner;

public class Array1Ques5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("The peak element is/are : ");
        for (int i = 0; i < n; i++) {
            if(i == 0){
                if(arr[i]>arr[n-1] && arr[i] > arr[i+1]){
                    System.out.print(arr[i]+" ");
                }
            }
            else if(i == (n-1)){
                if(arr[i]>arr[0] && arr[i] > arr[i-1]){
                    System.out.print(arr[i]+" ");
                }
            }
            else if(i != 0 || i != (n-1)){
                if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
        
    }
}
