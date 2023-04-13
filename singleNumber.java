import java.util.*;
public class singleNumber{

     public static void main(String []args){
    int arr[] = {2,2,1};
    int ans = 0;
    for(int i=0;i<arr.length;i++){
    ans ^= arr[i];
 }
     
     System.out.print(ans);
             

     }
}