import java.util.Scanner;
public class Szachownica {

	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String data = input.nextLine();
		String delims = "[ ]+";
		String[] tokens = data.split(delims);
		
		if(tokens.length==6)
		{
			int width = Integer.parseInt(tokens[0]);
			int height = Integer.parseInt(tokens[1]);
			int horizontal = Integer.parseInt(tokens[2]);
			int vertical = Integer.parseInt(tokens[3]);
			char whiteSign = tokens[4].charAt(0);
			char blackSign = tokens[5].charAt(0);
		}
	}
}
