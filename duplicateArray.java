//Remove duplicate element from array

public class duplicateArray{
    static int removeDuplicate(int arr[], int num){

        //returns number if its equal to 0 or 1
        if(num == 0 || num == 1)
            return num;

        //store index of next unique element
        int j = 0;
        //update index j
        for(int i =0; i < num - 1; i++){
            if(arr[i] != arr[i+1])
                arr[j++] = arr[i];
        }
        arr[j++] = arr[num - 1];
        return j;
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int num = arr.length;
        num = removeDuplicate(arr, num);
        for(int i=0; i<num; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
