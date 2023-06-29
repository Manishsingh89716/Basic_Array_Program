//To merge two array

public class mergeArray{
    public static void main(String[] args){
        int arr1[] = {23, 34, 32};
        int arr2[] = {20, 34, 28, 64, 65};

        //length of both array
        int len1 = arr1.length;
        int len2 = arr2.length;

        //length of array after merge
        int result = len1 + len2;

        //crate new arary
        int arr[] = new int [result];

        //to store element of first array
        for(int i=0; i<len1; i+=1){
            arr[i] = arr1[i];
        }

        //to store element of second array
        for(int i=0; i<len2; i+=1){
            arr[len1+i] = arr2[i];
        }

        //new array after merge
        for(int i=0; i<result; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
