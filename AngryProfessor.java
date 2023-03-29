import java.util.List;

public class AngryProfessor {
    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int count=0;
        for(int num : a)
        {
            if(num <=0)
                count++;
            if(count ==k)
                return "NO";
        }
        return "YES";

    }
}
