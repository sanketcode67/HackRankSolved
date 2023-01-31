import java.util.ArrayList;
import java.util.List;

public class FormingAMagicSquare {

    public static int formingMagicSquare(List<List<Integer>> s) {

        List<Integer> arr = new ArrayList<>();
        for(List<Integer> list: s)
        {
            for(int num : list)
                arr.add(num);
        }

        int[][] magic = {
                {8, 1, 6, 3, 5, 7, 4, 9, 2},
                {6, 1, 8, 7, 5, 3, 2, 9, 4},
                {4, 3, 8, 9, 5, 1, 2, 7, 6},
                {2, 7, 6, 9, 5, 1, 4, 3, 8},
                {2, 9, 4, 7, 5, 3, 6, 1, 8},
                {4, 9, 2, 3, 5, 7, 8, 1, 6},
                {6, 7, 2, 1, 5, 9, 8, 3, 4},
                {8, 3, 4, 1, 5, 9, 6, 7, 2}

        };
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<magic.length;i++)
        {
            int sum = 0;
            for(int j=0;j<9;j++)
            {
                sum += Math.abs((Integer)magic[i][j] - arr.get(j));
            }
            if(sum < min) min = sum;
        }


        return min;

    }

}
