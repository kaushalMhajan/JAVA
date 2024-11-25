
import java.util.Scanner;

public class infix_2_postfix {
    
    static int operator_precedence(char opt){
        if(opt=='^')
            return 3;
        else if(opt=='*' || opt=='/')
            return 2;
        else if(opt=='+' || opt=='-')
            return 1;
        else 
            return 0;
    }

    static void infixtopostfix(String infix){
        char[] postfix = new char[infix.length()];
        int index = 0;
        Stack_class stack = new Stack_class();
        stack.create_stack(infix.length()); 
        for (int i = 0; i < infix.length(); i++) {
            //2.1
            if(infix.charAt(i)=='('){
                stack.push(infix.charAt(i));
            }
            //2.2
            else if(infix.charAt(i)==')'){
                while(stack.peek()!='(' && !stack.is_Empty()){
                    postfix[index++] = (char)stack.pop();
                }
                stack.pop();
            }
            //2.3
            else if(infix.charAt(i)=='^' || infix.charAt(i)=='+' || infix.charAt(i)=='-' || infix.charAt(i)=='*' || infix.charAt(i)=='/'){
                while(!stack.is_Empty() && operator_precedence(infix.charAt(i)) <= operator_precedence((char)stack.peek())){
                    postfix[index++] = (char)stack.pop();
                }
                stack.push(infix.charAt(i));
            }
            // 2.4
            else{
                postfix[index++] = infix.charAt(i);
            }
        }

        //3
        while (!stack.is_Empty()) {
            postfix[index++] = (char)stack.pop();
        }

        for (int i = 0; i < postfix.length; i++) {
            System.out.print(postfix[i]+"");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an infix expression : ");
        String infix = sc.next();


        System.out.println("Your postfix notation is : ");
        infixtopostfix(infix);
    }

}
