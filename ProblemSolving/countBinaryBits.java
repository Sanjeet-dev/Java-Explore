import java.util.Scanner;
class CountBits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        int num = sc.nextInt();
        setBits(num);
        sc.close();
    }
    static void setBits(int n){
        int count1=0;
        int count0=0;
        while(n>0){
            int binary = n%2;
            n = n/2;
            System.out.print(binary+"");
            if(binary==1) count1++;
            else count0++;
        }
        System.out.println();
        System.out.print("count of 1 is "+count1+" and count of 0 is "+count0);
    }
}