import java.util.List;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int result = 0;
        // find lcm of array a
        int lcm = a.get(0);
        for(Integer num : a)
        {
            lcm = lcm(lcm,num);
        }

        //find gcd of array b
        int gcd = b.get(0);
        for(Integer num : b)
        {
            gcd = gcd(gcd,num);
        }

        //count X
        int multiple = 0;
        while(multiple<=gcd)
        {
            multiple += lcm;
            if(gcd % multiple == 0)
                result++;
        }

        return result;

    }
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
}
