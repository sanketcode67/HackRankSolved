import java.util.*;

public class ClimbingTheLeaderboard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

        Set<Integer> set = new HashSet<>(ranked);
        List<Integer> list = new ArrayList(set);
        List<Integer> result = new ArrayList<>();
        Collections.sort(list,Collections.reverseOrder());
        for(int num:player)
        {
            int res = binarysearch(list,num,0,list.size()-1);
            result.add(res+1);
        }
        return result;

    }

    public static int binarysearch(List<Integer> list,int key,int start,int end)
    {
        int mid = (start+end)/2;
        if(list.get(mid) == key)
            return mid;
        if(key < list.get(mid))
        {
            if(mid+1 <= end)
                return binarysearch(list,key,mid+1,end);
            else
                return mid+1;
        }

        else
        {
            if(mid-1 >= start)
                return binarysearch(list,key,start,mid-1);
            else
            {
                return mid;
            }
        }

    }
}
