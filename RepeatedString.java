public class RepeatedString {
    public static long repeatedString(String s, long n) {
        long length = s.length();
        long noOfaInS = 0;

        for(int i=0;i<length;i++)
        {
            if(s.charAt(i)=='a')
                noOfaInS++;
        }

        long rem = n % length;
        long div = n / length;

        long count = noOfaInS * div;
        for(int i=0;i<rem;i++)
        {
            if(s.charAt(i)=='a')
                count++;
        }

        return count;
    }
}
