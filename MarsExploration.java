public class MarsExploration {

    public static int marsExploration(String s) {
        // Write your code here
        char[] arr={'S','O','S'};
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char reqChar = arr[i%3];
            if(s.charAt(i)!= reqChar)
                count++;
        }
        return count;

    }
}
