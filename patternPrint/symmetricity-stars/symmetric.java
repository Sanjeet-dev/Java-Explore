/*
*         *
* *     * *
* * * * * *
* *     * *
*         *
 */
import java.util.Scanner;
class OneBaseSymmetry{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        sameBaseTriangle(num);
        sc.close();

    }
    static void sameBaseTriangle(int n){
        // outer loop
        for(int i=1; i<=2*n-1; i++){
            // inner loops
            int stars = i;
            if(i>n){
                stars=2*n-i;
            }
            // stars
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            // spaces
            int spaces= 2*(n-i);
            if(i>n){
                spaces= -2*(n-i);
            }
            for(int j=1; j<=spaces; j++){
                System.out.print("-");
            }
            // stars
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}