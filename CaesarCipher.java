public class CaesarCipher {
    public static String caesarCipher(String s, int k) {
        // Write your code here
        StringBuilder sb = new StringBuilder();
        for(char ch :s.toCharArray())
        {
            if(ch >='a' && ch<='z')
            {
                int c = ch -'a';
                int chiper= (c+k)%26;
                char res = (char)(chiper+'a');
                sb.append(res);

            }
            else if (ch >='A' && ch<='Z')
            {
                int c = ch -'A';
                int chiper= (c+k)%26;
                char res = (char)(chiper+'A');
                sb.append(res);
            }
            else
            {
                sb.append(ch);
            }
        }
        return sb.toString();

    }
}
