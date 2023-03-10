public class TowerBreakers {

    public static int towerBreakers(int n, int m) {
        int winner=0;
        if(m==1)
            winner=2;
        else if(n%2==0)
            winner=2;
        else
            winner=1;
        return winner;
    }
}
