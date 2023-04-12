import java.util.*;
public class removeDuplicate{

     public static void main(String []args){
     int nums[] = {1,1,2,3,3};
     int n = nums.length;
     int arr[] = new int[n];
     int count = 0;

     for(int i=0;i<n;i++){
        if(i==0 || nums[i] != nums[i-1]){
          arr[count++] = nums[i];
        }
     }
    
       for(int i=0;i<count;i++){
       System.out.print(arr[i] + " ");
     }
     }
}