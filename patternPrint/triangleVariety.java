import java.util.Scanner;
class InvertedTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want:");
        int num = sc.nextInt();
        nStarTriangle(num);
        invertedTriangle(num);

        sc.close();
        

    }
    static void invertedTriangle(int n){
        // outer loop
        for(int i=0; i<n; i++){
            //space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=0; j<2*(n-i)-1; j++){
                System.out.print("*");
            }
            //space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void nStarTriangle(int n) {
        // Write your code here
        // Don't need to think about outer loop of rows, simply use earlier way
        for(int i=0; i<n; i++){

            // inner loop will consists of space, star and space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
            
        }
    }
}