// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int[] nums = {1, 1, 2, 3, 3, 4, 4};
        int n = nums.length;
        // int ans = singleElement(nums,n);
        int ans = singleElementOptimal(nums,n);
        System.out.print(ans);
        
        
    }
   // Brute Force Approach
    public static int singleElement(int[] arr, int n){
       
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                return arr[i];
            }
        }
        return -1;
    }
   // optimal solution
    public static int singleElementOptimal(int[] arr, int n){
        int xor = 0;
        for(int i=0; i<n; i++){
            xor = xor^arr[i];
        }
        return xor;
    }
}