import java.util.Scanner;
class NumberPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        numberPattern(num);
        sc.close();
    }
    public static void numberPattern(int n){
        // outer loops
        for(int i=0; i<2*n-1; i++){
            // inner loops
            for(int j=0; j<2*n-1; j++){
                int top = i;
                int right = j;
                int bottom = 2*(n-1)-i;
                int left = 2*(n-1)-j;
                int ans = Math.min(Math.min(top,bottom),Math.min(right,left));
                System.out.print(n-ans);
            }
            System.out.println();
        }

    }
}