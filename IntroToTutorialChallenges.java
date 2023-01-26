import java.util.List;

public class IntroToTutorialChallenges {

    public static int introTutorial(int V, List<Integer> arr) {
        // Write your code here
        int targetIndex = 0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)==V)
            {
                targetIndex=i;
            }
        }

        return targetIndex;
    }
}
