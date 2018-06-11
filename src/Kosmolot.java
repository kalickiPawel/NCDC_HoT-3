import java.util.Scanner;

public class Kosmolot {
	
	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String data = input.nextLine();
		String delims = "[ ]+";
		String[] tokens = data.split(delims);
		
		if(tokens.length==2)
		{
			if(
				(
				  (tokens[0].length()==1 && tokens[0].charAt(0)>48 && tokens[0].charAt(0)<58) ||
				  (tokens[0].length()==2 && tokens[0].charAt(0)>48 && tokens[0].charAt(0)<55 && tokens[0].charAt(1)>47 && tokens[0].charAt(1)<58) ||
				  (tokens[0].length()==2 && tokens[0].charAt(0)=='7' && tokens[0].charAt(1)>47 && tokens[0].charAt(1)<54)
				) && (
				  (tokens[1].length()==1 && (tokens[1].charAt(0)=='Y' || tokens[1].charAt(0)=='N'))
				) 
			  )
			{
				int limit = Integer.parseInt(tokens[0]);
				
				switch(tokens[1].charAt(0))
				{
					case 'Y':
						for(int i=0; i<(2*limit-1); i++)  // rows
						{
							for(int j=0; j<limit; j++) // repeat
							{
								for(int k=0; k<limit; k++) // columns
								{
									if(((k<=i) && (i<=(2*limit-1)/2)) || ((limit-1-k>=i-(2*limit-1)/2) && (i>(2*limit-1)/2)))
										
										if((j==0 && k==0) || (j==limit-1 && k==limit-1)) 
											System.out.print(">");
										else if(k==i && i!=(2*limit-1)/2)
											System.out.print('\\');
										else if((limit-1-k==i-(2*limit-1)/2) && (i>(2*limit-1)/2))
											System.out.print('/');
										else
											System.out.print("*");

									else
										System.out.print(" ");
								}
							}
							System.out.println();
						}
						break;
					case 'N':
						for(int i=0; i<(2*limit-1); i++)  // rows
						{
							for(int j=0; j<limit; j++) // repeat
							{
								for(int k=0; k<limit; k++) // columns
								{
									if(((k<=i) && (i<=(2*limit-1)/2)) || ((limit-1-k>=i-(2*limit-1)/2) && (i>(2*limit-1)/2)))
										System.out.print("*");
									else
										System.out.print(" ");
								}
							}
							System.out.println();
						}
						break;
				}	
			}
		}
	}
}