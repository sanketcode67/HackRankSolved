import java.util.Collections;
import java.util.List;

public class BeautifulTriplets {
    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here
        int count = 0;

        for(int num: arr)
        {
            if(Collections.binarySearch(arr,num+d)>=0 && Collections.binarySearch(arr,num+d+d)>=0)
            {
                count++;
            }
        }


        return count;

    }

}
