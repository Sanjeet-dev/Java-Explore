import java.util.ArrayList;
class Sort012{
    public static void main(String[] args){
        int[] arr = {1,2,0,1,2,0,2,1,1,0,0,2};
        int n = arr.length;
        sort012(n,arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    public static void sort012(int n, int[] num){
        ArrayList<Integer> temp0 = new ArrayList<>();
        ArrayList<Integer> temp1 = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(num[i]==0){
                temp0.add(num[i]);
            }
            else if(num[i]==1){
                temp1.add(num[i]);
            }
            else if(num[i]==2){
                temp2.add(num[i]);
            }
        }

        // setting 0,1,2 to their required position
        int j=0;
        for(int val:temp0){
            num[j++]=val;
        }
        for(int val:temp1){
            num[j++]=val;
        }
        for(int val:temp2){
            num[j++]=val;
        }
        System.out.println("temp0 size:"+temp0.size());
        System.out.println("temp1 size:"+(n-temp1.size()));
        System.out.println("temp2 size:"+temp2.size());
    }
}