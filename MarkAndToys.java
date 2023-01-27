import java.util.Collections;
import java.util.List;

public class MarkAndToys {

    public static int maximumToys(List<Integer> prices, int k) {

        int count = 0 ;
        Collections.sort(prices);
        for(int price :prices)
        {
            if(price <=k)
            {
                count++;
                k = k - price;
            }
            else
            {
                break;
            }
        }
        return count;
    }
}
