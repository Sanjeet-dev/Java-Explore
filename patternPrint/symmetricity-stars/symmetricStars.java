import java.util.Scanner;
class Symmetry{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        invertedSymmetricVoid(num);
        straightSymmetricVoid(num);
        sc.close();
    }
    static void invertedSymmetricVoid(int n){
        // outer loop
        for(int i=0; i<n; i++){
            //inner loop
            // stars
            for(int j=n-i; j>=1; j--){
                System.out.print("*");
            }
            // spaces
            for(int j=0; j<2*i; j++){
                System.out.print("-");
            }
            // stars
            for(int j=n-i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void straightSymmetricVoid(int n){
        // outer loop
        for(int i=0; i<n; i++){
            //inner loops

            // stars
            for(int j=1; j<=i+1; j++){
                System.out.print("*");
            }
            // spaces
            for(int j=2*(n-i-1); j>0; j--){
                System.out.print("-");
            }
            // stars
            for(int j=1; j<=i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}