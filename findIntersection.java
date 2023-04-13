import java.util.*;
public class findIntersection{

     public static void main(String []args){
     
       HashSet<Integer> set1 = new HashSet<>();
       HashSet<Integer> set2 = new HashSet<>();

        int nums1 [] = {1,2,2,1,3};
        int nums2 [] = {2,2,1};

        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        int arr[] = new int[nums2.length];

        for(int i=0;i<nums2.length;i++){
            if(set1.contains(nums2[i])){
              set2.add(nums2[i]);
            }
          
        }
        int[] result = new int[set2.size()];
        int k = 0;
        for (int num : set2) {
            result[k++] = num;
        }
    
    for(int i=0;i<result.length;i++){
    System.out.print(result[i]); 
    }
          

     }
}