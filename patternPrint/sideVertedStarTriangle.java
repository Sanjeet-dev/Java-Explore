/*
patter print for rows = 3
 *
 **
 ***
 **
 *
 */

import java.util.Scanner;
class LeftOrientedTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input value for triangle:");
        int num = sc.nextInt();
        sideVerted(num);
        sc.close();
    }
    
    static void sideVerted(int n){
        // outer loop
        for(int i=1; i<=2*n-1; i++){
            // inner loop
            int stars=i;
            if(i>n){
                stars=2*n-i;
            }
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}