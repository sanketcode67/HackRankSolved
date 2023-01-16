import java.util.*;

public class LargestPermutation {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>(Arrays.asList(4 ,2 ,3 ,5 ,1));
        System.out.println(largestPermutation(2,arr));

    }
    public static List<Integer> largestPermutation(int k, List<Integer> arr) {

        int n = arr.size();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer, Integer> indices = new HashMap<>();


        //creating the max heap and indices hashmap here
        for(int i=0;i<n;i++)
        {
            maxHeap.offer(arr.get(i));
            indices.put(arr.get(i),i);
        }

        for (int i = 0; i < n; i++) {
            if(k==0) break;

            int maxVal = maxHeap.poll();
            if (arr.get(i) == maxVal)
            {
                continue;
            }


            int maxIndex = indices.get(maxVal);
            int temp = arr.get(i);
            arr.set(i, maxVal);
            arr.set(maxIndex, temp);
            indices.put(temp, maxIndex);
            k--;
        }
        return arr;

    }
}
