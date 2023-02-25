import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        for(int grade : grades)
        {
            if(grade<38)
                list.add(grade);
            else
            {
                int rem = grade % 5;
                int reqDiff= 5-rem;
                if(reqDiff < 3)
                    list.add(grade+reqDiff);
                else
                    list.add(grade);

            }
        }

        return list;

    }
}
