import java.util.*;

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);

        int[] res = new int[a.size()];

        int count=0;
        for(int i=0;i<a.size();i++)
        {
            for(int j=i;j<a.size();j++)
            {
                int abs = Math.abs(a.get(i)-a.get(j));
                if(abs <= 1)
                    count++;
            }
            res[i] = count;
            count=0;
        }

        return findMax(res);
    }
    public static int findMax(int[] arr)
    {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
