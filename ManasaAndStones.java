import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ManasaAndStones {

    public static List<Integer> stones(int n, int a, int b) {

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add((i*b)+(n-1-i)*a);
        }
        List<Integer> res = new ArrayList<>(set);
        Collections.sort(res);
        return res;
    }
}
