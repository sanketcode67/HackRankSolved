import java.util.Arrays;
import java.util.List;

public class OrganizingContainersOfBalls {

    public static String organizingContainers(List<List<Integer>> container) {

        int n = container.size();
        int[] rows = new int[n];
        int[] cols = new int[n];

        for(int i=0 ;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                rows[i] += container.get(i).get(j);
                cols[i] += container.get(j).get(i);
            }
        }
        Arrays.sort(rows);
        Arrays.sort(cols);


        if(Arrays.equals(rows,cols))
            return "Possible";
        else
            return "Impossible";

    }

}
