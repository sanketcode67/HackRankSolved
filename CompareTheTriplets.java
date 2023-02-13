import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alicePoint=0,bobPoint=0;
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<3;i++)
        {
            if(a.get(i)>b.get(i))
                alicePoint++;
            if(a.get(i)<b.get(i))
                bobPoint++;
        }
        list.add(alicePoint);
        list.add(bobPoint);
        return list;
    }
}
