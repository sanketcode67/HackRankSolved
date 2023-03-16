import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceInAnArray {
    public static int minimumAbsoluteDifference(List<Integer> arr) {

        Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<arr.size();i++)
        {
            int abs = Math.abs(arr.get(i-1)-arr.get(i));
            if(abs<min)
                min = abs;
        }
        return min;

    }
}
