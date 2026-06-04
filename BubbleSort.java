import java.util.*;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {4,3,1,2,8};

        for(int i=0;i<arr.length;i++){
            boolean swap = false;

            for(int j=0;j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }

                if(!swap){
                    break;
                }
            }
        }

        System.out.print(Arrays.toString(arr));
    }
}