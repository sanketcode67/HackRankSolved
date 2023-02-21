import java.util.List;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {
        int[] count = new int[6];

        for(int bird : arr)
        {
            count[bird] = count[bird] + 1;

        }
        int max_index = 0;
        for(int i=1;i<count.length;i++)
        {
            if(count[i] > count[max_index])
            {
                max_index=i;
            }
        }

        return max_index;

    }
}
