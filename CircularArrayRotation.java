import java.util.ArrayList;
import java.util.*;

public class CircularArrayRotation {
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        int n = a.size();
        int rotation = k%n;

        if(rotation!=0)
        {
            for (int i = n - rotation, j = n - 1; i < j; i++, j--) {
                int temp = a.get(i);
                a.set(i,a.get(j));
                a.set(j,temp);
            }

            for (int i = 0, j = n - rotation - 1; i < j; i++, j--) {
                int temp = a.get(i);
                a.set(i,a.get(j));
                a.set(j,temp);
            }
            // Reverse the entire array
            for (int i = 0, j = n - 1; i < j; i++, j--) {
                int temp = a.get(i);
                a.set(i,a.get(j));
                a.set(j,temp);
            }
        }

        System.out.println(a);

        for(int query:queries)
        {
            list.add(a.get(query));
        }

        return list;

    }
}
