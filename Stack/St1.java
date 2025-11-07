//Basics  & Implementation of stack 

import java.util.*;

public class St1{

  public static void main(String[] args){
  Stack<Integer> s = new Stack<>();
  //number 1 operation(add)
  s.push(1);//last item
  s.push(2);//second last item
  s.push(3);//last item always first to be removed

  //number 2 operation pop(remove)
  s.pop();
 
 
  //System.out.println(s);
  //number 3 operation peek(to see top element)
  System.out.println(s.peek());//to check top element




  }
}
