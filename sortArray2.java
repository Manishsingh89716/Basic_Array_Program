//Sort array in ascending order

import java.util.*;
public class sortArray2{
    public static void main(String[] args){
        int arr[] = {34, 15, 17, 12, 67, 55};
        System.out.println("Array before sorting:");

        //iterate array till the last element and perform sorting
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        Arrays.sort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
