import java.util.*;
public class BeginnerDrivingDilemma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the speed of the car:");
		double mph = input.nextDouble();
		double fps = mph * 1.466666666666666666666667;
		System.out.println("enter the feet to the light");
		double ftToLight = input.nextDouble();
		System.out.println("enter the amount of time till the light turns red");
		double sec = input.nextDouble();
		boolean x = (fps*sec)>=ftToLight;
		if(x) System.out.println("MADE IT");
		else System.out.println("FAILED TEST");
		input.close();
	}

}
