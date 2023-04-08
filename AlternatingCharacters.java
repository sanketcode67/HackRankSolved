import java.util.*;

public class AlternatingCharacters {
    public static int alternatingCharacters(String s) {
        // Write your code here
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray())
        {
            if(stack.empty() || stack.peek()!= ch)
            {
                stack.push(ch);
            }
            else
            {
                stack.pop();
                count++;
                stack.push(ch);
            }
        }
        return count;

    }
}
