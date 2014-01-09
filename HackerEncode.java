import java.util.*;


public class HackerEncode 
{
	public static Map<Character, Character> map_AE = new HashMap<Character, Character>();
	public static Map<Character, Character> map_AD = new HashMap<Character, Character>();
	
	public static Map<Character, Character> map_aE = new HashMap<Character, Character>();
	public static Map<Character, Character> map_aD = new HashMap<Character, Character>();
	
	
	public static void main(String args[])
	{
		long start = System.currentTimeMillis();
		
		boolean debug = false;
		intilize();
		Scanner input = new Scanner(System.in);
		
		for(;;)
		{
			String line = input.nextLine();
			
			if(line.equals("DONE"))
				break;
			
			if(debug)
				System.out.println(line);
			
			if(line.charAt(0) == 'E')
			{
				if(debug)
					System.out.println('E'+line.substring(7, line.length()));
				
				char data[] = line.substring(7, line.length()).toCharArray();
				
				StringBuilder result = new StringBuilder();
			
				for(int i=0;i<data.length;i++)
				{
					if(((int)data[i]) >=65 && ((int)data[i]) <=90)
					{
						result.append(map_AE.get(data[i]));
					}
					
					else if(((int)data[i]) >=97 && ((int)data[i]) <=122)
					{
						result.append(map_aE.get(data[i]));
					}
					else
					{
						result.append(data[i]);
					}
				}
				System.out.println(result.toString());
			}
			
			if(line.charAt(0) == 'D')
			{
				if(debug)
					System.out.println('D'+line.substring(7, line.length()));
				
				//line = line.substring(6, line.length());
				
				char data[] = line.substring(7, line.length()).toCharArray();

				StringBuilder result = new StringBuilder();

				for(int i=0;i<data.length;i++)
				{
					if(((int)data[i]) >=65 && ((int)data[i]) <=90)
					{
						result.append(map_AD.get(data[i]));
					}
					else if(((int)data[i]) >=97 && ((int)data[i]) <=122)
					{
						result.append(map_aD.get(data[i]));
					}
					else
					{
						result.append(data[i]);
					}
				}
				System.out.println(result.toString());
			}
		}
		
		long end = System.currentTimeMillis();
//		System.out.println(end-start);
	}
	
	public static void intilize()
	{
		map_AE.put('A','A');
	    map_AE.put('B', 'N');
	    map_AE.put('C', 'B');
	    map_AE.put('D', 'Y');
	    map_AE.put('E', 'C');
	    map_AE.put('F', 'O');
	    map_AE.put('G', 'D');
	    map_AE.put('H', 'U');
	    map_AE.put('I', 'E');
	    map_AE.put('J', 'P');
	    map_AE.put('K', 'F');
	    map_AE.put('L', 'X');
	    map_AE.put('M', 'G');
	    map_AE.put('N', 'Q');
	    map_AE.put('O', 'H');
	    map_AE.put('P', 'V');
	    map_AE.put('Q', 'I');
	    map_AE.put('R', 'R');
	    map_AE.put('S', 'J');
	    map_AE.put('T', 'Z');
	    map_AE.put('U', 'K');
	    map_AE.put('V', 'S');
	    map_AE.put('W', 'L');
	    map_AE.put('X', 'W');
	    map_AE.put('Y', 'M');
	    map_AE.put('Z', 'T');
	    
	    map_AD.put('A', 'A');
	    map_AD.put('N', 'B');
	    map_AD.put('B', 'C');
	    map_AD.put('Y', 'D');
	    map_AD.put('C', 'E');
	    map_AD.put('O', 'F');
	    map_AD.put('D', 'G');
	    map_AD.put('U', 'H');
	    map_AD.put('E', 'I');
	    map_AD.put('P', 'J');
	    map_AD.put('F', 'K');
	    map_AD.put('X', 'L');
	    map_AD.put('G', 'M');
	    map_AD.put('Q', 'N');
	    map_AD.put('H', 'O');
	    map_AD.put('V', 'P');
	    map_AD.put('I', 'Q');
	    map_AD.put('R', 'R');
	    map_AD.put('J', 'S');
	    map_AD.put('Z', 'T');
	    map_AD.put('K', 'U');
	    map_AD.put('S', 'V');
	    map_AD.put('L', 'W');
	    map_AD.put('W', 'X');
	    map_AD.put('M', 'Y');
	    map_AD.put('T', 'Z');
	 
	    map_aE.put('a', 'a');
	    map_aE.put('b', 'n');
	    map_aE.put('c', 'b');
	    map_aE.put('d', 'y');
	    map_aE.put('e', 'c');
	    map_aE.put('f', 'o');
	    map_aE.put('g', 'd');
	    map_aE.put('h', 'u');
	    map_aE.put('i', 'e');
	    map_aE.put('j', 'p');
	    map_aE.put('k', 'f');
	    map_aE.put('l', 'x');
	    map_aE.put('m', 'g');
	    map_aE.put('n', 'q');
	    map_aE.put('o', 'h');
	    map_aE.put('p', 'v');
	    map_aE.put('q', 'i');
	    map_aE.put('r', 'r');
	    map_aE.put('s', 'j');
	    map_aE.put('t', 'z');
	    map_aE.put('u', 'k');
	    map_aE.put('v', 's');
	    map_aE.put('w', 'l');
	    map_aE.put('x', 'w');
	    map_aE.put('y', 'm');
	    map_aE.put('z', 't');
	    
	    map_aD.put('a', 'a');
	    map_aD.put('n', 'b');
	    map_aD.put('b', 'c');
	    map_aD.put('y', 'd');
	    map_aD.put('c', 'e');
	    map_aD.put('o', 'f');
	    map_aD.put('d', 'g');
	    map_aD.put('u', 'h');
	    map_aD.put('e', 'i');
	    map_aD.put('p', 'j');
	    map_aD.put('f', 'k');
	    map_aD.put('x', 'l');
	    map_aD.put('g', 'm');
	    map_aD.put('q', 'n');
	    map_aD.put('h', 'o');
	    map_aD.put('v', 'p');
	    map_aD.put('i', 'q');
	    map_aD.put('r', 'r');
	    map_aD.put('j', 's');
	    map_aD.put('z', 't');
	    map_aD.put('k', 'u');
	    map_aD.put('s', 'v');
	    map_aD.put('l', 'w');
	    map_aD.put('w', 'x');
	    map_aD.put('m', 'y');
	    map_aD.put('t', 'z');
	}
}

