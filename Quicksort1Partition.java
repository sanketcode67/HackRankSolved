import java.util.ArrayList;
import java.util.List;

public class Quicksort1Partition {
    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here
        int pivot = arr.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (Integer element: arr
        ) {
            if(element < pivot)
                left.add(element);
            if(element > pivot)
                right.add(element);
        }
        left.add(pivot);
        result.addAll(left);
        result.addAll(right);
        return result;
    }
}
