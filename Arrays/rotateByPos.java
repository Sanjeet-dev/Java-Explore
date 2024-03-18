
class LeftRotateByK{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int pos = 3;
        rotate(arr,pos);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void rotate(int[] nums, int k) {
        
        int n=nums.length;
        k=k%n;
        
        int[] temp = new int[k];
        for(int i=0; i<k; i++){
            temp[i]=nums[i];
        }
        
        // position k to last element of nums array
        for(int i=k; i<n; i++){
            nums[i-k]=nums[i];
        }

        // filling initials positions in the nums array
        for(int i=n-k; i<n; i++){
          nums[i]= temp[i-(n-k)];
        }
        
    }
}