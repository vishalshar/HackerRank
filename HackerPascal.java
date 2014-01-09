public class HackerPascal 
{
	public static void main(String ags[])
	{
		int n=30,k,i,x;
		for(i=0;i<=n;i++)
		{
			x=1;
			for(k=0;k<=i;k++)
			{
				System.out.print(x+" ");
				x=x*(i-k)/(k+1);
			}
			System.out.println();
		}
	}
}
