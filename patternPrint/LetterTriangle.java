import java.util.Scanner;
class AlphabetTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        nLetterTriangle(num);
        sc.close();
    }
    static void nLetterTriangle(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(char ch='A'; ch<'A'+i; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}