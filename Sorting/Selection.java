// select minimum and swap it with last element
import java.util.Arrays;
class Selection{
    public static void main(String[] args){
        int[] data = {13,46,24,52,20,9};
        Selection obj = new Selection();
        obj.selectionSort(data);
        System.out.print(Arrays.toString(data));
    }
    public void selectionSort(int[] arr){
        // we will have iterate two less than the original length of array
        int m = arr.length;
        for(int i=0; i<m-1; i++){
            int min = i;
            for(int j=i+1; j<m; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            // put min at correct place
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            
        }
    }
    
}