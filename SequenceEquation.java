import java.util.ArrayList;
import java.util.List;

public class SequenceEquation {
    public static List<Integer> permutationEquation(List<Integer> p) {

        int n = p.size();
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            list.add(p.indexOf(p.indexOf(i)+1)+1);
        }
        return list;

    }
}
