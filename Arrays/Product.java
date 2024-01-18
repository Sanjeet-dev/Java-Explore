// Given an array nums of n integers, return an array output such that output[i] 
// is equal to the product of all the elements of nums except nums[i].
package Arrays;

class Product{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int size = arr.length;
        productWithoutSelf(arr,size);
        
    }

    static void productWithoutSelf(int[] arr, int n){
        int[] left = new int[n];
        int[] right = new int[n];
        int[] product = new int[n];
        
        left[0] = 1; 
        right[n-1] = 1;

        // traversing from left
        for(int i=1; i<n; i++){
            left[i] = arr[i-1]*left[i-1];
        }
        for(int j=n-2; j>=0; j--){
            right[j] = arr[j+1]*right[j+1];
        }

        for(int i=0; i<n; i++){
            product[i]=left[i]*right[i];
            System.out.print(product[i]+" ");
        }
        

    }

}