import java.util.List;

public class InsertionSortPart1 {
    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int lastEle = arr.get(n-1);

        int i=0;
        for(i=n-2;i>=0;i--)
        {
            if(arr.get(i) >= lastEle)
            {
                arr.set(i+1,arr.get(i));
            }
            else
            {
                break;
            }
            printArr(arr);
        }
        arr.set(i+1,lastEle);
        printArr(arr);


    }
    public static void printArr(List<Integer> arr)
    {
        for(int num:arr)
            System.out.print(num+" ");
        System.out.println();
    }
}
