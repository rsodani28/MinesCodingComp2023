import java.util.*;

public class BeginnerSarahsSandwichShop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter word:");
		String s = input.next();
		s = s.toUpperCase();
		String x = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C') {
				x = x + "2";
			} else if (s.charAt(i) == 'D' || s.charAt(i) == 'E' || s.charAt(i) == 'F') {
				x = x + "3";
			} else if (s.charAt(i) == 'G' || s.charAt(i) == 'H' || s.charAt(i) == 'I') {
				x = x + "4";
			} else if (s.charAt(i) == 'J' || s.charAt(i) == 'K' || s.charAt(i) == 'L') {
				x = x + "5";
			} else if (s.charAt(i) == 'M' || s.charAt(i) == 'N' || s.charAt(i) == 'O') {
				x = x + "6";
			} else if (s.charAt(i) == 'P' || s.charAt(i) == 'Q' || s.charAt(i) == 'R' || s.charAt(i) == 'S') {
				x = x + "7";
			} else if (s.charAt(i) == 'T' || s.charAt(i) == 'U' || s.charAt(i) == 'V') {
				x = x + "8";
			} else if (s.charAt(i) == 'W' || s.charAt(i) == 'X' || s.charAt(i) == 'Y' || s.charAt(i) == 'Z') {
				x = x + "9";
			}
		}
		System.out.println(x);
		input.close();
	}

}
