import java.util.Scanner;
class AlphaTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int num = sc.nextInt();
        alphaTriangle(num);
        sc.close();
    }
    static void alphaTriangle(int n){
        for(int i=0; i<n; i++){
            for(int j=64+n; j>=64+n-i; j--){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
        
    }
}