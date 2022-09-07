//Sorted , rotate array with distinct numbers (in ascending order) It is rotated at a pivot point .Find the index of given element

import java.util.*;

public class Rotatesortarr {

    public int search(int arr[], int tar, int si, int ei) {
        if(si > ei){
            return -1;
        }
        int mid = si+(ei-si)/2;

        if(arr[mid] == tar){
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]){

            //case a (for left side)
            if(arr[si] <= tar && tar <= arr[mid]){
                return(search(arr, tar, si, mid));
            }
            
            else{
                //case b (for right side)
                return(search(arr, tar, mid+1, ei));
            }
        }
        else{
            //case c (for right)
            if(arr[mid] <= tar && tar <= arr[ei]){
                return(search(arr, tar, mid+1, ei));
            }
            // case d (for left)
                return(search(arr, tar, si, mid-1));
            }
        }
    
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int taridx = search(arr, target, 0, arr.length-1);
        System.out.println(taridx);
    }
}
