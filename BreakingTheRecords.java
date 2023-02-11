import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {

        int min = scores.get(0);
        int max = scores.get(0);
        int minCount=0;
        int maxCount=0;

        for(int i=1;i<scores.size();i++)
        {
            int score = scores.get(i);

            if(score < min)
            {
                minCount++;
                min = score;
            }
            if( score > max)
            {
                maxCount++;
                max = score;
            }
        }

        List<Integer> list = new ArrayList<>();
        list.add(maxCount);
        list.add(minCount);

        return list;


    }
}
