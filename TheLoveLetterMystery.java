public class TheLoveLetterMystery {
    public static int theLoveLetterMystery(String s) {
        int n = s.length();
        int i=0;
        int j=0;
        int count = 0;
        for(i=0,j=n-1;i<j;i++,j--)
        {
            if(s.charAt(i) !=s.charAt(j))
            {
                char max = (char)Math.max(s.charAt(i),s.charAt(j));
                char min = (char)Math.min(s.charAt(i),s.charAt(j));
                count = count + (max - min);
            }
        }
        return count;

    }
}
