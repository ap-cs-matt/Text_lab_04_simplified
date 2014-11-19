import java.util.*;
import java.lang.*;
public class Text_lab_04_simplified_matthew_pearce {
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		String continue_program = "";
		do 
		{
			System.out.println("Enter a palindrome to be tested");
			String string_input = input.nextLine();
			
			StringBuilder string = new StringBuilder(string_input);
			StringBuilder sb_reverse = string.reverse();
			String reverse = sb_reverse.toString();

			if (string_input.equals(reverse))
				{
					System.out.println("Palindrome: true");
				}
			
			else if (string_input.replaceAll("[^A-Za-z0-9]", "").equalsIgnoreCase(reverse.replaceAll("[^A-Za-z0-9]", "")))
				{
				System.out.println("Palindrome: false");
				System.out.println("Almost Palindrome: true");
				}
			
			else
				{
				System.out.println("Palindrome: False");
				System.out.println("Almost Palindrome: False");
				}	
		
			System.out.println("Do you want to run this program agian [Y/N]");
			continue_program = input.nextLine();
		}
		while (continue_program.equalsIgnoreCase("y"));	
	}
}
