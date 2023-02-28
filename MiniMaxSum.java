import javax.xml.stream.events.Comment;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        int n = arr.size()-1;

        long min = 0;
        long max = 0;
        for(int i=0;i<4;i++)
        {
            min = min + arr.get(i);
        }
        for(int i=4;i>=1;i--)
        {
            max = max + arr.get(i);
        }

        System.out.print(min+" "+max);

    }
}
