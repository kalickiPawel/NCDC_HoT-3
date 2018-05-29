import java.util.Scanner;

public class Szachownica 
{

	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String data = input.nextLine();
		String delims = "[ ]+";
		String[] tokens = data.split(delims);
				
		if(tokens.length==6)
		{
			if(
				(
				  (tokens[0].length()==1 && tokens[0].charAt(0)>48 && tokens[0].charAt(0)<58) ||
				  (tokens[0].length()==2 && tokens[0].charAt(0)=='1' && tokens[0].charAt(1)>47 && tokens[0].charAt(1)<54)
				) && (
				  (tokens[1].length()==1 && tokens[1].charAt(0)>48 && tokens[1].charAt(0)<58) ||
				  (tokens[1].length()==2 && tokens[1].charAt(0)=='1' && tokens[1].charAt(1)>47 && tokens[1].charAt(1)<54)
				) && (
				  (tokens[2].length()==1 && tokens[2].charAt(0)>48 && tokens[2].charAt(0)<58) ||
				  (tokens[2].length()==2 && tokens[2].charAt(0)=='1' && tokens[2].charAt(1)>47 && tokens[2].charAt(1)<54)
				) && (
				  (tokens[3].length()==1 && tokens[3].charAt(0)>48 && tokens[3].charAt(0)<58) ||
				  (tokens[3].length()==2 && tokens[3].charAt(0)=='1' && tokens[3].charAt(1)>47 && tokens[3].charAt(1)<54)
				) && (
				  tokens[4].length()==1
				) && (
				  tokens[5].length()==1
				)
			  )
			{
				int width = Integer.parseInt(tokens[0]);
				int height = Integer.parseInt(tokens[1]);
				int horizontal = Integer.parseInt(tokens[2]);
				int vertical = Integer.parseInt(tokens[3]);
				char whiteSign = tokens[4].charAt(0);
				char blackSign = tokens[5].charAt(0);
				
				for(int i=0; i<vertical; i++)
				{
					for(int l=0; l<height; l++) 
					{
						for(int j=0; j<horizontal; j++)
						{
							if((i+j)%width==0)
							{
									for(int k=0; k<width; k++)
									{
										System.out.print(whiteSign);
									}
							}
							else
							{
									for(int k=0; k<width; k++)
									{
										System.out.print(blackSign);
									}
							}
						}
						System.out.println();
					}
				}
			}			
		}
	}
}
