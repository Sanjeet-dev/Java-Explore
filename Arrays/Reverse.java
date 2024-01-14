package Arrays;

import java.util.Scanner;

class Reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements for an array:");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        // print array
        System.out.println("Original Array");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("");
        System.out.println("Reversed Array:");
        // Reverse the array
        for(int i=size-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        
            
        }
        
        

        sc.close();

    }
}