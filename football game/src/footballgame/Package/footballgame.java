package footballgame.Package;
import java.util.Scanner;
public class footballgame {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.println("total touchdowns number");
		double TD = input.nextDouble();
		System.out.println("total yard number");
		double TY = input.nextDouble();
		System.out.println("INT number");
		double INT = input.nextDouble();
		System.out.println("comp number");
		double COMP = input.nextDouble();
		System.out.println("ATT number");
		double ATT = input.nextDouble();
		
		double a = (COMP/ATT - 0.3) * 5;
				if(a >=2.375){a = 2.375;}
				else if (a <0) {a =0;}
		double b = (TY/ATT - 3) * 0.25;
				if(b >=2.375){b = 2.375;}
				else if (b <0) {b =0;}
		double c = (TD/ATT) * 20;
				if(c >=2.375){c = 2.375;}
				else if (c <0) {c =0;}
		double d = 2.375 - (INT/ATT * 25);
				if(d >=2.375){d = 2.375;}
				else if (d <0) {d =0;}
		double passrate = (a + b + c + d) / 6 * 100;
		System.out.printf("%.1f",passrate);
	}

}
