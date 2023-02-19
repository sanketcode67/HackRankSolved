import java.text.DecimalFormat;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positive=0,negative=0,zero=0;
        int n = arr.size();
        for (Integer item : arr)
        {
//            System.out.println(item);
            if(item<0)
            {
                negative++;
            }
            if(item>0)
            {
                positive++;
            }
            if(item==0)
            {
                zero++;
            }

        }
        DecimalFormat df = new DecimalFormat("#.######");
        System.out.format("%.6f",(float) positive/n);
        System.out.println();
        System.out.format("%.6f",(float) negative/n);
        System.out.println();
        System.out.format("%.6f",(float) zero/n);

    }
}
