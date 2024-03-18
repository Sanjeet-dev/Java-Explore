package Arrays;
class RemoveDuplicates{
    public static void main(String[] args){
        int[] replicaArr = {2,4,5,6,6,3,3,10,12};
        System.out.print("Array with replicas: ");
        for(int i=0; i<replicaArr.length; i++){
        System.out.print(replicaArr[i]+" ");
        }
        System.out.println("");

        int k = removeTwins(replicaArr); 
        System.out.println("After removing replicas size of an arrays "+k);
        System.out.print("After removing replicas: ");
        for(int i=0; i<k; i++){
            System.out.print(replicaArr[i]+" ");
        }
    }

    static int removeTwins(int[] replica){
        // ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        for(int j=1; j<replica.length; j++){
            if(replica[i] != replica[j]){
                replica[i+1]=replica[j];
                i++;
                
            }
        }
        return i+1;
        
        
    }
}