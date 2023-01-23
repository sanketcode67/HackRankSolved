import java.util.List;

public class RunningTimeOfAlgorithms {
    public static int runningTime(List<Integer> arr) {
        int j=0;
        int i=0;
        int value = 0;
        int n=arr.size();
        int swap=0;
        for(i=1;i<n;i++)
        {
            value = arr.get(i);
            j = i-1;
            while(j>=0 && arr.get(j) >value)
            {
                j--;
            }

            if(j+1!=i && j+1<n)
            {
                //we had to do swap till from i-1 to j+1
                for(int k=i-1;k>=j+1;k--)
                {
                    //arr[k+1]= arr[k]
                    arr.set(k+1,arr.get(k));
                    swap++;
                }
                //insert value in arr[j+1]
                arr.set(j+1,value);
            }

            // //for printing array after 1 iteration
            // printArr(arr);
        }
        return swap;

    }
}
