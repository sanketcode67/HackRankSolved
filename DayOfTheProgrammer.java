public class DayOfTheProgrammer {

    public static String dayOfProgrammer(int year) {
        boolean isLeap= false;
        if(year == 1918)
            return "26"+"."+"09"+"."+year;
        if(year < 1918 && year%4==0 ||year > 1918 && isLeapYear(year))
        {
            isLeap = true;
        }


        if(isLeap)
        {
            return "12"+"."+"09"+"."+year;
        }
        else{
            return "13"+"."+"09"+"."+year;
        }

    }
    public static boolean isLeapYear(int year)
    {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            return true;
        }
        else
            return false;


    }
}
