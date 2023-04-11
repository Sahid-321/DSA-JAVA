/* Online Java Compiler and Editor */
import java.util.*;
public class bubbleSort{

public static void swap(int [] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

  public static int[] bubbleSort(int [] arr, int n){
   
    for(int i=0;i<n;i++){
         int count = 0;
       for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
            swap(arr, j, j+1);
            count++;
        }
       }
        if(count == 0){
        return arr;
    }
    }
   
    return arr;
     }
     public static void main(String []args){
   
    int [] arr = {2,1,4,3,5};
    int n = arr.length;
    bubbleSort(arr, n);
    for(int i=0;i<n;i++){
 System.out.print(arr[i]+" ");
    }

    
   
             

     }

   
}