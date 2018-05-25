import java.util.Scanner;

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
			int shift=0;
			int width = Integer.parseInt(tokens[0]);
			int height = Integer.parseInt(tokens[1]);
			int kick = Integer.parseInt(tokens[2]);
				
			if (width>0 && width<=100 && height>0 && height<=100 && kick<=100 && kick>=-100)
			{
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
