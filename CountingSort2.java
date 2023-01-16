import java.util.ArrayList;
import java.util.List;

public class CountingSort2 {
    public static List<Integer> countingSort(List<Integer> arr) {

        int[] count = new int[100];

        for(int num:arr)
        {
            count[num]++;
        }
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<count.length;i++)
        {
            for(int j=1;j<=count[i];j++)
            {
                list.add(i);
            }
        }
        return list;
    }
}
