import java.util.Scanner;
import java.util.regex.*;

public class Rownoleglobok 
{

	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String data = input.nextLine();
		String delims = "[ ]+";
		String[] tokens = data.split(delims);
		
		if(tokens.length==3)
		{
			if(((tokens[0].length()==1 && tokens[0].charAt(0)>47 && tokens[0].charAt(0)<58) ||
				(tokens[0].length()==2 && tokens[0].charAt(0)>47 && tokens[0].charAt(0)<58 &&
				tokens[0].charAt(1)>47 && tokens[0].charAt(1)<58) ||
				(tokens[0].length()==3 && tokens[0].charAt(0)=='1' &&
				tokens[0].charAt(1)=='0' && tokens[0].charAt(2)=='0')) &&
				
				((tokens[1].length()==1 && tokens[1].charAt(0)>47 && tokens[1].charAt(0)<58) ||
				(tokens[1].length()==2 && tokens[1].charAt(0)>47 && tokens[1].charAt(0)<58 &&
				tokens[1].charAt(1)>47 && tokens[1].charAt(1)<58) ||
				(tokens[1].length()==3 && tokens[1].charAt(0)=='1' &&
				tokens[1].charAt(1)=='0' && tokens[1].charAt(2)=='0')) &&
				
				(((tokens[2].length()==1 && tokens[2].charAt(0)>47 && tokens[2].charAt(0)<58) ||
				(tokens[2].length()==2 && tokens[2].charAt(0)>47 && tokens[2].charAt(0)<58 &&
				tokens[2].charAt(1)>47 && tokens[2].charAt(1)<58) ||
				(tokens[2].length()==3 && tokens[2].charAt(0)=='1' &&
				tokens[2].charAt(1)=='0' && tokens[2].charAt(2)=='0')) ||
						
				((tokens[2].length()==2 && tokens[2].charAt(0)=='-' &&
				tokens[2].charAt(1)>47 && tokens[2].charAt(1)<58) ||
				(tokens[2].length()==2 && tokens[2].charAt(0)=='-' &&
				tokens[2].charAt(1)>47 && tokens[2].charAt(1)<58) &&
				tokens[2].charAt(2)>47 && tokens[2].charAt(2)<58) ||		
				(tokens[2].length()==4 && tokens[2].charAt(0)=='-' &&
				tokens[2].charAt(1)=='1' && tokens[2].charAt(2)=='0' && 
				tokens[2].charAt(3)=='0'))
			  )
			{
				int shift=0;
				
				int width = Integer.parseInt(tokens[0]);
				int height = Integer.parseInt(tokens[1]);
				int kick = Integer.parseInt(tokens[2]);
				
				int kickInv=kick*-1;
				int shiftMax = height*kickInv;
						
				for (int j=0; j<height; j++)
				{
					if(kick>=0) 
					{						
						for (int m=0; m<shift; m++)
							System.out.print(" ");
					}
					else 
					{
						for (int m=shiftMax-kickInv; m>0; m--)
							System.out.print(" ");
					}
						
					for (int i=0; i<width; i++) 				
						System.out.print("*");
							
					System.out.println();
							
					if(kick>=0)
						shift += kick;
					else
						shiftMax -= kickInv;
				}
			}
		}
	}
}
