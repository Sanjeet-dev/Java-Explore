import java.util.*;
class ReverseBits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get its long reverse:");
        int num = sc.nextInt();
        reverseBits(num);
        sc.close();
    }
    static void reverseBits(int n){
        long sum = 0;
        int exp = 31;
        while(n>0){
            int bits = (int)n%2;
            if(bits == 1){
                sum += Math.pow(2,exp);
            }
            n /= 2;
        }
        exp--;
        System.out.print(sum);
    }
}