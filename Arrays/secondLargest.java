// "Return second largest and second smallest from the array"

class Second{
    public static void main(String[] args){
        int[] arr = {2,5,6,3,8,10};

        int[] ans = secondSmallestAndLargest(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] secondSmallestAndLargest(int[] nums){
        int[] ans = new int[2];
        int largest = nums[0];
        int sLargest = Integer.MIN_VALUE;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>largest && sLargest<largest){
                sLargest = largest;
                largest = nums[i];
            }
            
        }
        ans[0] = sLargest;
        int smallest = nums[0];
        int sSmallest = Integer.MAX_VALUE;
        for(int i=1; i<nums.length; i++){
            if(nums[i]<smallest){
                sSmallest = smallest;
                smallest = nums[i];
            }
            else if(nums[i]<sSmallest){
                sSmallest = nums[i];
            }
        }
        ans[1]=sSmallest;
        return ans;
    }
}