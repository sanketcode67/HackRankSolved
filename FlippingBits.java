public class FlippingBits {
    public static long flippingBits(long n) {

        return n ^ (long) (Math.pow(2, 32) - 1);

    }
}
