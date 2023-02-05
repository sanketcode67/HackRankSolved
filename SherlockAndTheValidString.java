import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndTheValidString {

    public static String isValid(String s) {
        // Write your code here
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray())
        {
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }

        ArrayList<Integer> list =new ArrayList<>();
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            list.add(entry.getValue());
        }
        Collections.sort(list);

        ArrayList<Integer> a = (ArrayList<Integer>) list.clone();
        a.remove(0);
        ArrayList<Integer> b = (ArrayList<Integer>) list.clone();
        int temp = b.get(b.size()-1);
        b.remove(b.size()-1);
        b.add(temp-1);

        System.out.println(list);
        System.out.println(a);
        System.out.println(b);

        if(isAllElementEqual(list) || isAllElementEqual(a) || isAllElementEqual(b))
        {
            return "YES";
        }
        else
        {
            return "NO";
        }

    }

    public static boolean isAllElementEqual(ArrayList<Integer> list)
    {
        int value = list.get(0);
        for(int num : list)
        {
            if(num!=value)
                return false;
        }
        return true;
    }
}
