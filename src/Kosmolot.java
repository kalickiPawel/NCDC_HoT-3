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
				System.out.println(tokens[0]);
				System.out.println(tokens[1]);
			}
		}
	}
}