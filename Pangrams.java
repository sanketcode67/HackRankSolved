public class Pangrams {
    public static String pangrams(String s) {
        // Write your code here
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(ch>='A' && ch <='Z')
            {
                int index = ch -'A';
                arr[index] = 1;
            }
            if(ch>='a' && ch <='z')
            {
                int index = ch -'a';
                arr[index] = 1;
            }
        }
        for(int num : arr)
        {
            if(num == 0)
                return "not pangram";
        }
        return "pangram";

    }
}
