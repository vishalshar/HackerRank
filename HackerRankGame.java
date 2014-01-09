import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRankGame {
/* Head ends here */
static void nextMove(int x, int y, int color, String [] grid)
    {
        int count = 0;
        int bestCount = 0;
        int bestX = 0;
        int bestY = 0;
        
        char[][] gri = new char[x][y];
        
        for(int i=0;i<x;i++)
        {
        	char temp[] = grid[i].toCharArray();
        	for(int j=0;j<y;j++)
        	{
        		gri[i][j]= temp[j];
        	}
        }
            boolean done = false;
        for(int i=0;i<x;i++)
        {
        	for(int j=0;j<y;j++)
        	{
        		if(gri[i][j]!='-')
        		{
        			if(i!=(x-1) && j!=(y-1))
        			{
        				if(gri[i][j] == gri[i][j+1])
        				{
        					System.out.println(i+" "+(j+1));
                            done = true;
        					break;
        				}
        				if(gri[i][j] == gri[i+1][j])
        				{
        					System.out.println(i+1+" "+j);
                            done = true;
                            break;
        				}
        			}
        			else if(i == (x-1) && j!=(y-1))
        			{
        				if(gri[i][j] == gri[i][j+1])
        				{
        					System.out.println(i+" "+(j+1));
        					done = true;
        					break;
        				}
        			}
        			else
        			{
        				System.out.println(i+j);
        			}
        		}
        	}
            if(done)
                break;
        }
    }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int k = in.nextInt();

        String grid[] = new String[x];

        for(int i = 0; i < x; i++) {
            grid[i] = in.next();
        }

        nextMove(x, y, k, grid);
    }
}