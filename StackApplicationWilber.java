/** M4 T1: Explore Infix to Postfix Using Stack: StackApplication.java
* @author E Wilber
* @version 1.0
* @since 1.0
*  
* OS: Windows11
* IDE: Eclipse
* 
* Citation:
* IncludeHelp. "Infix to Postfix Conversion using Stack (C Program)." IncludeHelp,
*  https://www.includehelp.com/c/infix-to-postfix-conversion-using-stack-with-c-program.aspx. Accessed 2/9/2025
*  
* GeeksforGeeks. "Convert Infix Expression to Postfix Expression." GeeksforGeeks,
*  https://www.geeksforgeeks.org/convert-infix-expression-to-postfix-expression/. Accessed 2/9/2025
* 
* Copyright : This is my own original work 
* based on specifications issued by our instructor
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or
* unmodified, nor used generative AI as a final draft. 
* I have not given other fellow student(s) access to my program.
*/
package module4;
import java.util.Scanner;
import java.util.Stack;

public class StackApplicationWilber { 
//Precedence of operators
    private static int precedence(char ch) {
        switch (ch) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;
            default: return -1;
        }
    }    
//Converts infix to postfix
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();       
        for (char ch : infix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Removes ( from stack
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }       
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }       
        return postfix.toString();
    }   
    public static void main(String[] args) {
        String[] infixExpressions = {
            "2+3*4",
            "a*b+5",
            "(1+2)*7",
            "a*b/c",
            "(a/(b-c+d))*(e-a)*c",
            "a/b-c+d*e-a*c"
        };        
        System.out.println("**************************************************************");
        for (String infix : infixExpressions) {
            System.out.println("Infix: " + infix);
            System.out.println("Postfix: " + infixToPostfix(infix));
            System.out.println("**************************************************************");
        }      
//Enter input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter infix notation with no spaces*: ");
        String userInfix = scanner.nextLine();
        System.out.println("Infix: " + userInfix);
        System.out.println("Postfix: " + infixToPostfix(userInfix));
        System.out.println("**************************************************************");
        
        scanner.close();
    }
}
