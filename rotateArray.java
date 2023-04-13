import java.util.*;
public class rotateArray{

     public static void main(String []args){
    int arr[] = {-1,-100,3,99};
    int k = 2;

    ArrayList<Integer> list = new ArrayList<>();
  //  Stack<Integer> stack = new Stack<>();
    for(int i=arr.length-k;i<arr.length;i++){
      list.add(arr[i]);
    }
    for(int i=0;i<arr.length-k;i++){
        list.add(arr[i]);
    }

      for(int i=0;i<arr.length;i++){
        arr[i] = list.get(i);
        System.out.print(arr[i]+" ");
    }

             

     }
}