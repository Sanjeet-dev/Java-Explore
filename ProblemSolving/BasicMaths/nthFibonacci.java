import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sequence:");
        int num = sc.nextInt();
        nthFibonacci(num);
        sc.close();
    }
    static void nthFibonacci(int n){
        int a=0;
        int b=1;
        int mod = (int)(1e9+7);
        int c;
        if(n<2){
            System.out.print(n);
        }
        
        else{
        for(int i=2; i<=n; i++){
            c = a+b;
            a = b;
            b = c;
            if(b>=mod){
                b=b-mod;
            }
        }
        System.out.print("The value at "+n+"th sequence is "+b);
        }
    }
}