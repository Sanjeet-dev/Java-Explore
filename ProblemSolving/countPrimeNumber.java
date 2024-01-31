
import java.util.Scanner;
class CountPrime {
	
	// Write your totalPrime function here
	public int totalPrime(int s, int e){
		int count = 0;
        for(int i=s; i<=e; i++){
            if(isPrime(i)){
                count++;
            
            }
        }
        return count;
	}
	public static boolean isPrime(int n){
		if(n<=1){
			return false;
		}
		else{
			for(int i=2; i*i<=n; i++){
				if(n%i==0){
					return false;
				}
			}
			return true;
		}
	}
		
}


class Solution {
	public static void main(String args[]) {
		
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting value: ");
		int s = sc.nextInt();
        System.out.print("Enter the end value: ");
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
        sc.close();
	}
}