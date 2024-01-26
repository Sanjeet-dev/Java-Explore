import java.util.Scanner;
class Triangle{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mention the number for pattern print:");
        int num = sc.nextInt();
        starTriangle(num);
        numberTriangle(num);
        number2Triangle(num);

        sc.close();
    }
    static void starTriangle(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
    static void numberTriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
    static void number2Triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


