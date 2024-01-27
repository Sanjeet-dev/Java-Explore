import java.util.Scanner;
class IncreaseNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num of rows for increasing number triangle: ");
        int num = sc.nextInt();
        increasingNumber(num);
        sc.close();
    }
    static void increasingNumber(int n){
        // Outer loop
        int num = 1;
        for(int i=1; i<=n; i++){
            // inner loop
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num += 1;
            }
            System.out.println();
            
        }
    }
}