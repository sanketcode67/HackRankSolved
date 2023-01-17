import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumber {

    public static List<Integer> closestNumbers(List<Integer> arr) {
        //soring the array
        Collections.sort(arr);

        //size of the array
        int n= arr.size();

        //assgning the 1st min difference
        int minDiff = Math.abs(arr.get(0)-arr.get(1));

        //taken a list of to store the resultant pairs with minimum difference
        List<Integer> res = new ArrayList<>();

        //iterating over the sorted array taking one one pair
        for(int i=0;i<n-1;i++)
        {
            //finding absolute difference of the pair
            int diff = Math.abs(arr.get(i)-arr.get(i+1));

            //if the diff is min difference the add the pair in result list
            if(diff == minDiff)
            {
                res.add(arr.get(i));
                res.add(arr.get(i+1));
            }

            //if the current difference is less than min difference
            //then till now we are adding the wrong pairs in the list
            //clear all elements of the list
            //update new minDiff
            //add the current pair (pair with the current min difference) in the list
            if(diff < minDiff)
            {
                minDiff = diff;
                res.clear();
                res.add(arr.get(i));
                res.add(arr.get(i+1));

            }
        }
        System.out.println(res);


        return null;

    }
}
