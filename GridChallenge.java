import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {
    public static String gridChallenge(List<String> grid) {
        // Write your code here

        int[] r = {-1};
        int[] c = {0};
        List<String> sortedGrid = new ArrayList<>();

        for(String str : grid)
        {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            sortedGrid.add(String.valueOf(arr));

        }
//        System.out.println(sortedGrid);

        int rsize = sortedGrid.size();
        int csize = sortedGrid.get(0).length();
//        System.out.println(rsize);
//        System.out.println(csize);

        for(int i=0;i < rsize;i++)
        {
            for(int j=0;j < csize;j++)
            {
                char ch1 = sortedGrid.get(i).charAt(j);
//                System.out.print(ch1);


                int rr = i -1;
                int cc = j + 0;

                if(rr >=0 && rr <rsize && cc >= 0 && cc < csize)
                {
                    char ch2 = sortedGrid.get(rr).charAt(cc);
                    if(ch1 < ch2 )
                        return "NO";
                }


            }
        }

        return "YES";
    }
}
