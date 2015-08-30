import java.util.Scanner;

/**
 * Reverser is a recursive method that reverses a String.
 * @author Jonathan Love
 * @version 8-30-2015
 */
public class Reverser {
	private static String reverse(String text)
	{
		if (text.length() <= 1) { return text; }
		else
		{
			String str = text.substring(0,1);
			text = text.substring(1,text.length());
			//System.out.print("\ntext: " + text + " | str: " + str);
			text = reverse(text) + str;
		}
		return text;
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Provide input: ");
		String input = in.nextLine();
		System.out.print("\nReversed Output:" + reverse(input));
		
		in.close();
	}
}