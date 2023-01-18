public class StrangeCounter {
    public static long strangeCounter(long t) {
        // Write your code here
        long val = 3;
        while (t > val) {
            t -= val;
            val *= 2;
        }
        return val - t + 1;

    }
}
