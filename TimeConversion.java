public class TimeConversion {

    public static String timeConversion(String s) {
        // Write your code here
        String  time = s.substring(8);

        if(time.equals("AM"))
        {
            int hours = Integer.parseInt(s.substring(0,2));
            String hh ="";
            if(hours ==12)
            {
                hours-=12;
                if(hours<10)
                    hh = "0" + hours;

                return hh + s.substring(2,8);
            }
            else
            {
                return s.substring(0,8);
            }

        }

        else
        {
            int hours = Integer.parseInt(s.substring(0,2))+12;
            if(hours == 24)
                hours -= 12;
            String hh = ""+hours;
            if(hours<10)
                hh = "0" + hh;

            return hh + s.substring(2,8);
        }
    }
}
