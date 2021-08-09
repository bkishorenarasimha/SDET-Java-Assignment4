import java.util.*;

class KeystoList
{
	public static void main(String[] args)
	{	
		Map<Character, Integer> cmap = new HashMap<Character, Integer>();
        cmap.put('J',1);
		cmap.put('a',2);
		cmap.put('v',1);
		Set<Character> keys = cmap.keySet();
		List <Character> keyslist = new ArrayList<Character>();
		for (char c : keys)
        {
			keyslist.add(c);
		}
		System.out.println("keys to list is "+keyslist);
    }
}