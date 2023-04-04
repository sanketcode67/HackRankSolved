public class SeparateTheNumbers {
    public static void separateNumbers(String s) {
        // Write your code here
        int n = s.length();
        boolean flag = false;

        for(int length = 1; length<=n/2;length++)
        {
            long first = Long.parseLong(s.substring(0,length));
            long copy_first = first;
            StringBuilder sb = new StringBuilder();
            sb.append(first);
            while(sb.length() < n)
            {

                sb.append(++copy_first);
            }
            if(s.equals(sb.toString()))
            {
                System.out.println("YES "+first);
                flag = true;
                break;
            }

        }
        if(flag == false) System.out.println("NO");

    }
}
