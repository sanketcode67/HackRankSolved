import java.util.ArrayList;
import java.util.Arrays;

public class StrongPassword {

    public static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int[] arr= {6,1,1,1,1};
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('!','@','#','$','%','^','&','*','(',')','-','+'));
        for(char ch : password.toCharArray())
        {
            if(arr[0]>0)
                arr[0]-= 1;
            if(ch>='0' && ch<='9' && arr[1]!=0)
                arr[1] = arr[1]-1;
            if(ch>='a' && ch<='z' && arr[2]!=0)
                arr[2] = arr[2]-1;
            if(ch>='A' && ch<='Z' && arr[3]!=0)
                arr[3] = arr[3]-1;
            if(list.contains(ch) && arr[4]!=0)
            {
                arr[4]=arr[4]-1;
            }
        }
        int sum = 0;
        for (int i=1;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        if(arr[0] > sum)
            return arr[0];
        return sum;

    }
}
