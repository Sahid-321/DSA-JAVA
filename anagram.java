/* Online Java Compiler and Editor */
import java.util.*;
public class anagram{

     public static void main(String []args){
         String a = "abcd";
         String b = "dabc";
         int count = 0;
   HashSet<String> set = new HashSet<>();
   for(int i=0;i<a.length();i++){
      set.add(Character.toString(a.charAt(i)));
      
       // System.out.println(a.charAt(i));
   }
   for(int i=0;i<b.length();i++){
     if(set.contains(Character.toString(b.charAt(i)))){
         count++;
        
     }
      
       // 
   }  
   if(count == a.length()){
      System.out.println("yes");  
   }else{
        System.out.println("no");
   }
      
     }
}