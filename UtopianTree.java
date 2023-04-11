public class UtopianTree {
    public static int utopianTree(int n) {
        int height = 0;
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
                height = height + 1;
            else
                height = height * 2;
        }

        return height;
    }
}
