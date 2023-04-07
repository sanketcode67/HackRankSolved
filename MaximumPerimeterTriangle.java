import java.util.*;
public class MaximumPerimeterTriangle {
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        Collections.sort(sticks);
        List<Integer> list = new ArrayList<>(3);
        int i = sticks.size()-3;
        while(i>=0)
        {
            if(sticks.get(i)+ sticks.get(i+1) > sticks.get(i+2))
            {
                list.add(sticks.get(i));
                list.add(sticks.get(i+1));
                list.add(sticks.get(i+2));
                return list;
            }
            else
            {
                i= i-1;
            }
        }
        list.add(-1);
        return list;

    }
}
