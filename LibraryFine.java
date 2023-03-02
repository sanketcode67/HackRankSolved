public class LibraryFine {

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here
        int year = y1 - y2;
        int month = m1 - m2;
        int day = d1 - d2;

        if(year <0 || year==0 && month<0 || year==0 && month ==0 && day <0)
            return 0;
        else if(year==0 && month==0 && day >0)
            return day * 15;
        else if (year==0 && month >0) {
            return month * 500;
        }
        else
        {
            return 10000 * year;
        }

    }
}
