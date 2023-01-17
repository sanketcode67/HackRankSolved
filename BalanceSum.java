import java.util.List;

public class BalanceSum {
    public static String balancedSums(List<Integer> arr) {

        int n = arr.size();
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        //calculating the left sum of all the elements
        for(int i=0;i<n;i++)
        {
            if(i-1 < 0)
            {
                leftSum[i] = 0;
            }
            else
            {
                leftSum[i] = arr.get(i-1) + leftSum[i-1];
            }
        }

        //calculating the right sum of all the elements
        for(int i=n-1;i>=0;i--)
        {
            if(i+1 > n-1)
            {
                rightSum[i] = 0;
            }
            else
            {
                rightSum[i] = arr.get(i+1) + rightSum[i+1];
            }
        }

        //now check if left sum of a element is equal to right sum of that element or not
        for(int i=0;i<n;i++)
        {
            if(leftSum[i] == rightSum[i])
            {
                return "YES";
            }
        }

        return "NO";
    }
}
