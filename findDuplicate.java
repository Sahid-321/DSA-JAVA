import java.util.*;
public class findDuplicate{

public static boolean duplicate(int arr[]){
   Arrays.sort(arr);
     for(int i=0;i<arr.length-1;i++){
    if(arr[i] == arr[i+1]){
        return true;
    }
     }
             
return false;
}
     public static void main(String []args){
    int arr[] = {1,2,1,3};
     
  System.out.println(duplicate(arr));
     }
}