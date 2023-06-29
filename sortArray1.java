//Sort array in descending order

import java.util.*;
public class sortArray1 {
    public static void descending(int[] arr){
        //length of array
        int len = arr.length;

        //swap first half element with second half
        for(int i=0; i<len/2; i++){

            //store first half element temporarily
            int temp = arr[i];
            //assign first half to second half
            arr[i] = arr[len - i - 1];
            //assign second half to first
            arr[len - i - 1] = temp;
        }
    }

    public static void main(String[] args){
        int arr[] = {43, 67, 21, 17, 87, 78};
        //sort array
        Arrays.sort(arr);
        //call function for printing array in descending order
        descending(arr);
        System.out.println(Arrays.toString(arr));
    }
}
