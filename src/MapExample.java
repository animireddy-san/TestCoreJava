import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String args[])
    {
        Map<Integer,String> hmap=new HashMap<>();
        hmap.put(10,"san");
        hmap.put(20,"van");
        for(Map.Entry m:hmap.entrySet())
        {
            System.out.println(m.getKey());
        }

    }
}
