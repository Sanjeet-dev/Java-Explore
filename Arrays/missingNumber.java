package Arrays;
class missingNumber{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,10};
        missingInt(arr,10);

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
}