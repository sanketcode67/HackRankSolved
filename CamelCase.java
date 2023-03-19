public class CamelCase {

    public static int camelcase(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch >='A' && ch <=91)
                count++;
        }
        return count+1;

    }
}
