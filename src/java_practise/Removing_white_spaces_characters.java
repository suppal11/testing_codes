package java_practise;

public class Removing_white_spaces_characters {

	public static void main(String[] args) {
		String s="This is my test";
		String s1="";
		//char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				s1=s1+s.charAt(i);
			}
		}

System.out.println(s1);
	}

}
