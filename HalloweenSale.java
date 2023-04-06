public class HalloweenSale {
    public static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int count = 0;
        while(p <= s)
        {
            s = s - p;
            count++;
            if( p >= m)
            {
                if(p-d >=m)
                    p = p - d;
                else
                    p = m;
            }

        }
        return count;

    }
}
