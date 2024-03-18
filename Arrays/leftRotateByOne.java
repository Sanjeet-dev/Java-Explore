// Left rotate by one place ex [1,2,3,4,5]==[2,3,4,5,1]
class LeftRotate{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int[] ans = leftRotateByOne(arr);
        for(int i=0; i<ans.length; i++ ){
            System.out.print(ans[i]+" ");
        }

    }
    public static int[] leftRotateByOne(int[] nums){
        int temp = nums[0];
        int n = nums.length;
        for(int i=1; i<n; i++){
            nums[i-1]=nums[i];
        }
        nums[n-1] = temp;
        return nums;
    }
}