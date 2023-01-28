import java.util.Collections;
import java.util.List;

public class FindTheMedian {

    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);

        int midIndex = arr.size()/2;

        return arr.get(midIndex);

    }
}
