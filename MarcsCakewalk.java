import java.util.Collections;
import java.util.List;

public class MarcsCakewalk {
    public static long marcsCakewalk(List<Integer> calorie) {
        // Write your code here
        Collections.sort(calorie);
        Collections.reverse(calorie);
        long result = 0;
        for(int i=0;i<calorie.size();i++)
        {
            result += ((long)Math.pow(2,i))*calorie.get(i);
        }
        return result;

    }
}
