import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        System.out.println(candles);
        Collections.sort(candles);
        System.out.println(candles);

        int maxcandle = candles.get(candles.size()-1);
        int count = 0;
        for(int i=candles.size()-1;i>=0;i--)
        {
            if(maxcandle== candles.get(i))
                count++;
            else
                break;
        }
        return count;

    }
}
