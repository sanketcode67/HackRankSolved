import java.util.Stack;

public class SuperReducedString {
    public static String superReducedString(String s) {
        // Write your code here
        char[] chars = s.toCharArray();
        Stack<Character> stack= new Stack<>();
        StringBuilder sbf = new StringBuilder();

        for (Character ch: chars
        ) {
            if(stack.empty())
            {
                stack.push(ch);
            }
            else
            {
                if (stack.peek() == ch)
                {
                    stack.pop();
                }
                else {
                    stack.push(ch);
                }
            }

        }
        for (Character ch:stack) {
            sbf.append(ch);
        }
        if(stack.empty())
            return "Empty String";

        return sbf.toString();
    }
}
