//to find common elements in two arrays

import java.util.*;
public class commonElement{
   static void findCommon_element(int[] arr1, int[] arr2){

       //creating hashset
       Set<Integer> set1 = new HashSet<>();
       Set<Integer> set2 = new HashSet<>();

       //adding element of first array
       for(int i : arr1){
           set1.add(i);
       }

       //adding element of second array
       for(int i : arr2){
           set2.add(i);
       }

       //retain function used to find common elements
       set1.retainAll(set2);
       System.out.println("Common elements are: " + set1);
   }

   public static void main(String[] args){
       int arr1[] = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
       int arr2[] = {100, 9, 64, 7, 36, 5, 16, 3, 4, 1};

       System.out.println("Array1 = " + Arrays.toString(arr1));
       System.out.println("Array2 = " + Arrays.toString(arr2));
       findCommon_element(arr1, arr2);
   }
}
