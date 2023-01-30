import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {

        int n = A.size();
        Collections.sort(A);
        Collections.sort(B,Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {
            if(A.get(i) + B.get(i) < k)
            {
                return "NO";
            }
        }
        return "YES";

    }
}
