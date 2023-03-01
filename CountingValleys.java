public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int value=0;
        boolean flag=false;
        int result=0;
        for(char ch : path.toCharArray())
        {
            if(ch =='U')
                value++;
            if(ch == 'D')
                value--;
            if(value == -1 && flag == false)
                flag =true;
            if(value == 0 && flag == true)
            {
                result++;
                flag = false;
            }
        }

        return result;

    }
}
