



package edu.ru.lab09;

import java.util.*;
import java.util.Stack;

public class MainClass
{
  public static void main (String[]args)
  {

   String exp1 = "(2+4) * 8 + ((3-1) + 7)";
   String exp2 = "(2+4*7 + (3 -1) + 8";
   if (isBalanced(exp1)) 
        System.out.println(exp1+" Balanced");
    else
        System.out.println(exp1+" Not Balanced");
        if (isBalanced(exp2)) 
        System.out.println(exp2+" Balanced");
    else
        System.out.println(exp2+" Not Balanced");
      
 
  }

public static boolean isBalanced(String exprssion) {
      Stack<Character> stk = new Stack<Character>();
      if(exprssion == null || exprssion.length() == 0) {
           return false;
      } else {    
        for(int i = 0; i < exprssion.length(); i++){
            
          if (exprssion.charAt(i) == '(' || exprssion.charAt(i) == '{' || exprssion.charAt(i) == '[' ) {
            stk.push(exprssion.charAt(i));
          } else if(exprssion.charAt(i) == ')') {
        if(!stk.isEmpty() && stk.peek() == '(') {
              stk.pop();
          }else {
              return false;
         }
          } else if (exprssion.charAt(i) == ']') {
               if(!stk.isEmpty() && stk.peek() == '[') {
                  stk.pop();
              } else {
                  return false;
              }
          } else if(exprssion.charAt(i) == '}'){
              if(!stk.isEmpty() && stk.peek() == '{') {
                  stk.pop();
              } else {
                  return false;
              }
          }
        }
        
        // if stack is empty finally , it means symbol is balance in expression
        if(stk.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
 }
}
