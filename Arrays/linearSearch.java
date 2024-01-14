package Arrays;

import java.util.Scanner;
class LinearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search for its index:");
        int ele = sc.nextInt();
        int[] arr = {25,15,10,86,12,18};
        for(int i=0; i<arr.length; i++){
            if(ele == arr[i]){
                System.out.println("The element "+ele+" is at "+i+" index");
            }else{
                System.out.println("Not found");
            }
        }
        sc.close();
    }
}