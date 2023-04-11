/* Online Java Compiler and Editor */
import java.util.*;
public class quickSort{

public static void swap(int [] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

  public static int partition(int [] arr, int l, int h){
   
  int pivot = arr[l];
  int i=l;
  int j=h;
  while(i<j){
    while(arr[i]<= pivot && i<h) i++;
    while(arr[j] > pivot) j--;

    if(i<j){
        swap(arr, i, j);
    }

  }
  swap(arr, j, l);
  return j;

     }

     public static void quickSort(int arr[], int l, int h){
        if(l<h){
            int pivot = partition(arr, l, h);
           quickSort(arr, l, pivot-1);
           quickSort(arr, pivot+1, h);
        }
     }
     public static void main(String []args){
   
    int [] arr = {2,1,4,3,5,7,4};
    int n = arr.length;
    quickSort(arr, 0, n-1);
    for(int i=0;i<n;i++){
 System.out.print(arr[i]+" ");
    }

    
   
             

     }

   
}