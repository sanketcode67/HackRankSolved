public class SaveThePrisoner {
    public static int saveThePrisoner(int n, int m, int s) {
        int res = (s+m-1)%n;
        if(res ==0)
            return n;
        return res;


    }
}
