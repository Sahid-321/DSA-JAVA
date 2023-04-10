/* Online Java Compiler and Editor */
import java.util.*;
public class palindrome{

     public static void main(String []args){
   
   String s = "malayalam";
   int n = s.length();
    int count = 0;
   for(int i=0;i<s.length();i++){
    if(s.charAt(i)==s.charAt(n-1-i)){
      count ++;
 
    }
   }
   if(count == n){
 System.out.println("Yes");
   }else{
     System.out.println("No");
   }
             

     }
}