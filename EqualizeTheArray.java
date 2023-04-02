import java.util.*;

public class EqualizeTheArray {
    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int num : arr)
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
            list.add(entry.getValue());
        }
        Collections.sort(list);
        int sum =0;
        for(int i=0;i< list.size()-1;i++)
        {
            sum = sum + list.get(i);
        }
        return sum;

    }
}
