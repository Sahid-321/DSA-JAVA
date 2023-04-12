import java.util.*;
public class balanceParenthesis{

     public static void main(String []args){
     
     String str = "{([])}";
     Stack<Character> stack = new Stack<>();

     for(int i=0;i<str.length();i++){

         if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '('){
           stack.push(str.charAt(i));
         }
        else if(!stack.empty() && str.charAt(i) == ')' && stack.peek()=='(' ){
                stack.pop();
            }
            else  if(!stack.empty() && str.charAt(i) == ']' && stack.peek()=='[' ){
                stack.pop();
            }
            else  if(!stack.empty() && str.charAt(i) == '}' && stack.peek()=='{' ){
                stack.pop();
            }


        
     }
if(stack.empty()){
 System.out.print("Yes balances");
}else{
    System.out.print("No not balanced");
}

  
     }
}