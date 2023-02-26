public class DrawingBook {

    public static int pageCount(int n, int p) {
        // Write your code here
        int left = p/2;
        int right = (n/2)-(p/2);

        if(left < right)
            return left;
        return right;

    }
}
