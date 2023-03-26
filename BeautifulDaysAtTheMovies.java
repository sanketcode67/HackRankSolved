public class BeautifulDaysAtTheMovies {
    public static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for(int num=i ;num <=j;num++)
        {
            int absValue = Math.abs(num - reverse(num));
            if(absValue % k==0)
                count++;
        }
        return count;

    }
    public static int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            int d = n %10;
            rev = rev *10 + d;
            n = n/10;
        }
        return rev;
    }
}
