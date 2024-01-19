// Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array. 
// Assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements 
// from nums2.
package Arrays;
// import java.util.Scanner;
class Merge{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int m = sc.nextInt();
        // int n = sc.nextInt();

        int[] arr1 = {2,4,5,6,11,14,};
        int n1 = arr1.length;
        int[] arr2 = {3,9,10,12,15};
        int n2 = arr2.length;
        int[] arr3 = new int[n1+n2];



        mergeSortedArrays(arr1,arr2,n1,n2,arr3);
    }

    static void mergeSortedArrays(int[] nums1, int[] nums2, int n1, int n2, int[] nums3){
        // Taking three pointers for respective arrays
        int i=0; 
        int j=0;
        int k=0;
        // comparing elements of arr1 and arr2 then storing into arr3
        while(i<n1 && j<n2){
            if(nums1[i]< nums2[j]){
                nums3[k++]=nums1[i++];
            }
            else{
                nums3[k++]=nums2[j++];
            }
        }
        // arr1 to arr3
        while(i<n1){
            nums3[k++]=nums1[i++];
        }
        // arr2 to arr3
        while(j<n2){
            nums3[k++]=nums1[j++];
        }
        // simply printing arr3
        for(int m=0; m<nums3.length; m++){
            System.out.print(nums3[m]+" ");
        }

    }
}