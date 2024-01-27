import java.util.Scanner;
class BinaryRightTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want:");
        int num = sc.nextInt();
        binaryDigitTriangle(num);

        sc.close();
    }
    static void binaryDigitTriangle(int n){
        // outer loop
        int digit=1;
        for(int i=1; i<=n; i++){
            if(i%2==0) digit=0;
            else digit=1;
            for(int j=1; j<=i; j++){
                System.out.print(digit+" ");
                digit=1-digit;

            }
            System.out.println();

        }
    }
}