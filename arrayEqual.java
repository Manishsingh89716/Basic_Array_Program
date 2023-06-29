//To check two arrays are equal or not

import java.util.*;
public class arrayEqual{
    public static void main(String[] args){
        int arr1[] = {10, 20, 30, 40};
        int arr2[] = {10, 20, 30, 40, 50};

        //check the condition array are equal or not, if true returns equal else returns not equal
        boolean check = Arrays.equals(arr1, arr2);
        if(check == true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
