public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int max = -1;
        boolean flag = false;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if(keyboards[i]+drives[j] <= b && keyboards[i]+drives[j]  >max )
                {
                    max = keyboards[i]+drives[j];
                    flag = true;
                }
            }

        }
        return max;

    }
}
