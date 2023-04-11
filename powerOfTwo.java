/* Online Java Compiler and Editor */
import java.util.*;
public class powerOfTwo{

     public static void main(String []args){
   
 
     System.out.println(power(6));
   
             

     }

     public static boolean power(int n){
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            n = n/2;
        }
        return true;
     }
}