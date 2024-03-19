import java.util.ArrayList;
class ZeroInEnd{
    public static void main(String[] args){
        int[] arr = {1, 2, 0, 0, 2, 3};
        int n = arr.length;
        // int[] ans = moveZeros(arr.length, arr);
        int[] ans = moveZeroesToEnd(n, arr);
        for(int i: ans){
            System.out.print(i+" ");
        }
    }

    // brute force approach
    public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        ArrayList <Integer> temp = new ArrayList<>();

        // step 1
        for(int i=0; i<n; i++){
            if(a[i] != 0){
                temp.add(a[i]);
            }
        }

        //step 2
        for(int i=0; i<temp.size(); i++){
            a[i]=temp.get(i);
        }

        // step 3
        for(int i=temp.size(); i<n; i++){
            a[i]=0;
        }
        return a;
    }

    // optimal solution using 2 pointer method
    public static int[] moveZeroesToEnd(int n,int[] nums){

        int j=-1;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }

        if(j==-1) return nums;
        for(int i=j+1; i<n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }
}