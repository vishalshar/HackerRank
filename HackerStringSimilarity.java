import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerStringSimilarity 
{
	public static void main(String args[])
	{
		try{
			Scanner input = new Scanner(System.in);
			int cases = input.nextInt();
			input.nextLine();
			for(int i=0;i<cases;i++)
			{
				String s = input.nextLine();
				Vector<Integer>[] v = new Vector[s.length()];
				int sPrefix = s.length();
				v[0] = new Vector<Integer>();
				v[0].add(new Integer(0));
				for(int j = 1; j < s.length(); j++)
				{
					v[j] = new Vector<Integer>();
					v[j].add(new Integer(0));
					for(int k = 0; k < v[j - 1].size(); k++)
						if(s.charAt(j) == s.charAt(v[j - 1].get(k)))
						{
							v[j].add(v[j - 1].get(k) + 1);
							v[j - 1].set(k, 0);
						}
				}

				for(int j = 0; j < v.length; j++)
					for(int k = 0; k < v[j].size(); k++)
						sPrefix += v[j].get(k);

				System.out.println(sPrefix);
			}
		}
		catch(Exception e)
		{
			return;
		}
	}
}
