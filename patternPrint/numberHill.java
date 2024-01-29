import java.util.Scanner;
class Hill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        numHill(num);
        System.out.println();
        alphaHill(num);

        sc.close();
    }
    static void numHill(int n){
        // outer loop 
        
        for(int i=1; i<=n; i++){
            // inner loop

            // space
            for(int j=1; j<=n-i; j++){
                System.out.print("-");
            }

            //number print
            // increasing number
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            // decreasing number
            for(int j=i-1; j>=1; j--){
                System.out.print(j);
            }

            //space
            for(int j=1; j<=n-i; j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
    static void alphaHill(int n){
        for(int i=1; i<=n; i++){
            // inner loop

            // space
            for(int j=1; j<=n-i; j++){
                System.out.print("-");
            }

            //alphabet print
            // increasing alphabets
            for(int j=1; j<=i; j++){
                System.out.print((char)(64+j)+" ");
            }
            // decreasing alphabets
            for(int j=i-1; j>=1; j--){
                System.out.print((char)(64+j)+" ");
            }

            //space
            for(int j=1; j<=n-i; j++){
                System.out.print("-");
            }
            System.out.println();
        }

    }
}