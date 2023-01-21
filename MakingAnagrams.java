import java.util.HashMap;

public class MakingAnagrams {
    public static int makingAnagrams(String s1, String s2) {
        // Write your code here
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for (char ch :s1.toCharArray())
        {
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }
        for (char ch :s2.toCharArray())
        {
            map2.put(ch, map2.getOrDefault(ch,0)+1);
        }


        //common character occurrence delete
        for(Character ch:map1.keySet())
        {
            if(map2.containsKey(ch))
            {
                int min = Math.min(map1.get(ch),map2.get(ch));
                map1.put(ch, map1.get(ch)-min);
                map2.put(ch,map2.get(ch)-min);
            }
        }

        //calculate result by adding all the values in map1 and map2
        int result = 0;
        for(Character ch:map1.keySet())
            result += map1.get(ch);
        for(Character ch:map2.keySet())
            result += map2.get(ch);



        return result;

    }
}
