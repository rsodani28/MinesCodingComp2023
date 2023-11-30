import java.util.*;
public class BeginnerAboveSeaLevel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Type in current sea level:");
		Double altitudeRN = input.nextDouble();
		System.out.println("The sea level in 2050 (according to your change formula) will be: " + (altitudeRN - 0.3));
		input.close();
	}

}
