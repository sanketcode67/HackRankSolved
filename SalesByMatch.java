import java.util.HashMap;
import java.util.List;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {

        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:ar)
        {
            if(map.containsKey(num))
            {
                map.put(num,map.get(num)+1);
            }
            else
            {
                map.put(num,1);
            }
        }

        System.out.println(map);

        for(Integer key:map.keySet())
        {
            int pair = map.get(key) / 2;
            count = count + pair;
        }

        return count;
    }
}
