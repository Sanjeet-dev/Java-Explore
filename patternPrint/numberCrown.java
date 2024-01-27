import java.util.Scanner;
class NumberCrown{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for crown:");
        int num = sc.nextInt();
        nNumberCrown(num);
        sc.close();
    }
    static void nNumberCrown(int n){
    
            // Write your code here.
            // outer loop;
            int space = 2*(n-1);

            for(int i=1; i<=n; i++){
                // number print
                for(int j=1; j<=i; j++){
                    System.out.print(j);
                }
                // space
                for(int j=1; j<=space; j++){
                    System.out.print(" ");
                }
                // number print
                for(int j=i; j>=1; j--){
                    System.out.print(j);
                }
                System.out.println();
                space=space-2;
            }
        }

    
}