class Divisors{
    public static int sumOfDiv(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                sum+=i;

            }
        }
        
        return sum;
    }
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int sum=0;
        
        for(int i=1; i<=n; i++){
            sum+= sumOfDiv(i);
            
        }
        return sum;
    }
    public static void main(String[] args){
        int num = 10;
        int ans = sumOfAllDivisors(num);
        System.out.print("The sum of all possible divisors of "+num+": "+ ans);
    }
    
}