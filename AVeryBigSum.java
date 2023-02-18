import java.util.List;

public class AVeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        Long result = 0L;
        for (Long item : ar)
        {
            System.out.println(item);
            result = Long.sum((Long) result, (Long) item);
        }
        return result;
    }
}
