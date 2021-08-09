import java.util.*;

class DuplicateCharactersInString
{
	static void duplicateCharCount(String inputString)
	{
		Map<Character, Integer> cmap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();

        for (char c : strArray)
        {
			if(cmap.containsKey(c))
			{
				cmap.put(c, cmap.get(c)+1);
			}
			else
			{
				cmap.put(c, 1);
			}
		}
        Set<Character> charsInString = cmap.keySet();
        System.out.println("Duplicate Chars In "+inputString);
        for (Character ch : charsInString)
        {
			if(cmap.get(ch) > 1)
			{
				System.out.println(ch +" : "+ cmap.get(ch));
			}
		}
	}
    public static void main(String[] args)
    {
       duplicateCharCount("JavaJ2EE");
    }
}