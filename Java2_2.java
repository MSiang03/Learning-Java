package Java_exercise;

import java.util.*;
public class Java2_2 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        char[] charArray = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean flag = true;

        for(int i=0; i< charArray.length;i++){
            if(charArray[i] == '('){
                stack.push('(');
            }
            else if(charArray[i] == '{'){
                stack.push('{');
            }
            else if(charArray[i] == '['){
                stack.push('[');
            }
            else if(charArray[i] == ']'){
                if(!stack.empty() && stack.peek()=='['){
                    stack.pop();
                }
                else{
                    flag = false;
                }
            }
            else if(charArray[i] == '}'){
                if(!stack.empty() && stack.peek()=='{'){
                    stack.pop();
                }
                else{
                    flag = false;
                }
            }
            else if(charArray[i] == ')'){
                if(!stack.empty() && stack.peek()=='('){
                    stack.pop();
                }
                else{
                    flag = false;
                }
            }
        }
        if(stack.empty() && flag){
            System.out.println("true");
        }
        else if(!flag || !stack.empty()){
            System.out.println("false");
        }
    }
}
