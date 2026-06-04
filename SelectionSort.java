import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        
        int[] arr = {3,4,1,2,5};

        for(int i=0;i<arr.length-1;i++){

            int minIndex = i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }

            if(i!=minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }



        }

        System.out.println(Arrays.toString(arr));
    }
}
