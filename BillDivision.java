import java.util.List;

public class BillDivision {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        bill.set(k,0);
        int sum=0,annaBill;
        for (Integer i: bill)
        {
            sum= sum + i;
        }
        annaBill = sum/2;
        if(b > annaBill)
        {
            System.out.println(b-annaBill);
        }
        else
        {
            System.out.println("Bon Appetit");
        }


    }
}
