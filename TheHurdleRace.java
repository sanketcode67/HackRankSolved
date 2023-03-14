import java.util.Collections;
import java.util.List;

public class TheHurdleRace {

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        Collections.sort(height);
        int max = height.get(height.size()-1);
        if(k>=max)
            return 0;
        else
            return max-k;


    }
}
