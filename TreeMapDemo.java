import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args )
    {
        Map<String,Integer> h = new TreeMap<>();
        h.put("a", new Integer(100)); 
        h.put("b", new Integer(200));
        h.put("c", new Integer(300));
        h.put("d", new Integer(400));

        Set<Map.Entry<String,Integer> > s = h.entrySet();
        for(Map.Entry<String,Integer> me :s)
        {
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }



    }
}
