import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        //principal diagonal sum
        int pd=0;
        //secondary diagonal sum
        int sd=0;

        //loop to find the sum of pd ans sd
        for(int i=0;i<arr.size();i++)
        {
            pd = pd + arr.get(i).get(i);
            sd = sd + arr.get(i).get(arr.get(i).size()-i-1);
        }

        return Math.abs(pd - sd);

    }
}
