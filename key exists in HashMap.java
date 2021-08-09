import java.util.*;

class CharacterexistInHashmap
{
	public static void main(String[] args)
	{	
		char key='a';
		Map<Character, Integer> cmap = new HashMap<Character, Integer>();
        cmap.put('J',1);
		cmap.put('a',2);
		cmap.put('v',1);
		//for (char c : cmap.keySet())
        	if(cmap.containsKey(key))
				System.out.println("key is present");
			else
				System.out.println("key is not present");
	}
}