import java.util.Scanner;


public class HackerStringDNA 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		input.nextLine();
		
		for(int i=0;i<cases;i++)
		{
			String one = input.nextLine();
			String two = input.nextLine();

			if(i < cases-1)
			{
				input.nextLine();
			}
			if(two.length()<=one.length())
			{
				char oneCh[] = one.toCharArray(); 
				char twoCh[] = two.toCharArray();
				
				int count = 0;
				int notmatch = 0;
								
				for(int j=0;j<=((int)oneCh.length-twoCh.length);j++)
				{
					notmatch = 0;
					for(int k=j,z=0;z<twoCh.length && notmatch <2;k++,z++)
					{
						if(oneCh[k]!=twoCh[z])
						{
							notmatch++;
						}
					}
					if(notmatch<2)
					{
						System.out.print(j+" ");
					}
				}
				System.out.println();
			}
			else
			{
				System.out.println();
			}
		}
	}
}
