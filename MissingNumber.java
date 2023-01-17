import java.util.*;

public class MissingNumber {


    public static void main(String[] args) {


        List<Integer> arr1 = new ArrayList<>(Arrays.asList(203 ,204, 205 ,206 ,207, 208 ,203, 204 ,205 ,206));
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(203,204 ,204 ,205 ,206 ,207 ,205, 208 ,203 ,206 ,205 ,206, 204));
        System.out.println(missingNumbers(arr1,arr2));
    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {

        Set<Integer> set = new HashSet<>();

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:brr)
        {
            if(map.containsKey(num) == false)
            {
                //element is not present in map
                set.add(num);
            }
            else
            {
                //element is present in map
                int value = map.get(num);
                if(value != 0)
                {
                    map.put(num,value-1);
                }
                if(value == 0)
                    set.add(num);
            }
        }

        List<Integer> res = new ArrayList<>(set);

        Collections.sort(res);
        return res;
    }
}
