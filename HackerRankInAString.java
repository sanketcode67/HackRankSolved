public class HackerRankInAString {
    public static String hackerrankInString(String s) {
        String str = "hackerrank";
        int n = str.length();
        int i=0;

        for(char ch : s.toCharArray())
        {
            if(ch == str.charAt(i))
            {
                i++;
                if(i==n) return "YES";
            }
        }
        return "NO";


    }
}
