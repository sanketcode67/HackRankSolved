public class SherlockAndSquares {
    public static int squares(int a, int b) {
        int to = (int)Math.floor(Math.sqrt(b));
        int from = (int)Math.ceil(Math.sqrt(a));
        return to - from + 1;
    }
}
