// Return boolean value for array being sorted

// package Arrays;
// import java.util.Scanner;

class BoolSort{
    public static void main(String[] args){
        int[] arr = {3,5,6,9,4,12};
        int k = isSorted(arr);
        System.out.print("The array is Sorted: "+k);

    }

    public static int isSorted(int[] nums){
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<=nums[i]){

            }
            else{
                return 0;
            }
        }

        return 1;
    }
}
    
