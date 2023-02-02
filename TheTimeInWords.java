public class TheTimeInWords {

    public static String timeInWords(int h, int m) {

        String nums[] = { "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty one",
                "twenty two", "twenty three", "twenty four",
                "twenty five", "twenty six", "twenty seven",
                "twenty eight", "twenty nine",
        };

        if (m == 0)
            return nums[h] + " o' clock ";

        else if (m == 1)
            return "one minute past " +nums[h];

        else if (m == 59)
            return "one minute to " +nums[(h % 12) + 1];

        else if (m == 15)
            return "quarter past " + nums[h];

        else if (m == 30)
            return "half past " + nums[h];

        else if (m == 45)
            return "quarter to " +nums[(h % 12) + 1];

        else if (m <= 30)
            return nums[m] + " minutes past " +nums[h];

        else if (m > 30)
            return nums[60 - m] + " minutes to " +nums[(h % 12) + 1];
        else
            return " ";
    }
}
