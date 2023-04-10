public class BeautifulBinaryString {

    public static int beautifulBinaryString(String b) {
        int i = 0;
        int count = 0;
        while(i <= b.length()-3)
        {
            if(b.charAt(i)=='0' && b.charAt(i+1)=='1' && b.charAt(i+2)=='0')
            {
                count++;
                i=i+3;
            }
            else
            {
                i=i+1;
            }

        }
        return count;

    }
}
