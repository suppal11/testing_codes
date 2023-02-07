package java_practise;

public class Reverse_of_each_word 
{
	static void words_reversal(String input)
	{
		String[] words=input.split(" ");
		String rev_string="";
		for(int i=0;i<words.length;i++)
		{
			//System.out.println(words[i]);

			String rev_word="";
			for(int j=words[i].length()-1;j>=0;j--)
			{
				rev_word=rev_word+words[i].charAt(j);
			}

			rev_string=rev_string+rev_word+" ";
			
		}
		System.out.print(rev_string);
	}

	public static void main(String[] args) 
	{

		words_reversal("I love India");
	}

}
