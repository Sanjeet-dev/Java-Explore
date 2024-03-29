// Write a program to take user input for an array of integers and then find the largest and smallest element.

package Arrays;
import java.util.Scanner;
class Largest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        System.out.println("Enter the array elements:");
        int[] input = new int[size];
        
        for(int i=0; i<size; i++){
            input[i] = sc.nextInt();

        }
        // printing an array first
        for(int x=0; x<input.length; x++){
            System.out.println("The element at " +x+" position is "+input[x]);
        }

        // find the largest element
        int max = input[0];
        int smax = Integer.MIN_VALUE;
        for(int j=1; j<input.length; j++){
            if(input[j]>max && smax<max){
                smax=max;
                max=input[j];
                

            }
            else if(input[j]>smax){
                smax=input[j];
            }

        }
        System.out.println("The largest element in an array is "+ max);
        System.out.print("The second largest element in an array is: "+smax);
        sc.close();
    }
}