package Arrays;
class missingNumber{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,10};
        int N = arr.length;
        missingInt(arr,10);
        int ans = missingNum(arr, N);
        System.out.print(ans);

    }
    static void missingInt(int[] arr,int num){
        int sum = 0; 
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println("Array sum:"+sum);
        double fullSum = num*(num+1)/2;
        System.out.println("without missing number sum: "+fullSum);
        double result = fullSum-sum;
        System.out.println("The missing number is "+ (int)result);


    }
    public static int missingNum(int[] num, int N){
        int xor1=0;
        int xor2=0;
        int n = N-1;

        for(int i=0; i<n; i++){
            xor2 = xor2^num[i];
            xor1 = xor1^(i+1);
        }
        xor1 = xor1 ^ N;
        return xor1^xor2;
    }
}