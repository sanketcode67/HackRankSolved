import java.util.*;
public class MinimumDistances {
    public static int minimumDistances(List<Integer> a) {
        // Write your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> pairs = new ArrayList<>();
        List<Integer> dist = new ArrayList<>();

        for(int num : a)
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
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 2)
                pairs.add(entry.getKey());
        }
        if(pairs.isEmpty()) return -1;

        for(int pair : pairs)
        {
            int left = 0;
            int right = 0;
            boolean flag = false;

            for (int i=0;i<a.size();i++)
            {
                if(a.get(i) == pair && flag == false)
                {
                    left = i;
                    flag= true;
                }
                if(a.get(i) == pair && flag == true)
                {
                    right = i;
                }
            }
            dist.add(right - left);

        }

        Collections.sort(dist);
        return dist.get(0);

    }
}
