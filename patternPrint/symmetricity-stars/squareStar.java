/*
for n==4
 ****
 *  *
 *  *
 ****
 */
import java.util.Scanner;
class Square{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        int num = sc.nextInt();
        starSquare(num);
        sc.close();
    }
    public static void starSquare(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop
            
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==n || j==n){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }

    }
}