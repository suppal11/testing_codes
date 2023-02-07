package java_practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Find_Duplicate_words_in_string 
{
	//Test String="Hi Java is Java so is java why is java"

	public static void cal_duplicate_words(String test)
	{
		String[] str_array=test.split(" ");
		Map<String,Integer> hm=new HashMap<String,Integer>();
		for(String word:str_array)
		{
			if(hm.containsKey(word))
			{
				hm.put(word.toLowerCase(), hm.get(word)+1);
			}
			else
			{
				hm.put(word, 1);			}
		}
		Set<Entry<String, Integer>> a1=hm.entrySet();
		for(Entry<String, Integer> eset:a1)
		{
			if(eset.getValue()>1)
			{
				System.out.println("Found Duplicate words "+eset.getKey()+" and their frequency "+eset.getValue());
			}
		}
	}




	public static void main(String[] args) 
	{

		cal_duplicate_words("Hi Java is Java so is java why is java");
	}

}
