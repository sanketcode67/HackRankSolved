import java.util.List;

public class GamingArray {

    public static String gamingArray(List<Integer> arr) {
        // Write your code here
        int max= 0;
        int count=0;
        int left = 0;
        int right = arr.size()-1;
        for (int i = left; i <= right; i++) {
            if(arr.get(i)>max)
            {
                max = arr.get(i);
                count++;

            }
        }

        System.out.println(count);
        if(count%2==1)
            return "BOB";

        return "ANDY";

    }
}
