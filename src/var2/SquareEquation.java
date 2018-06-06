package var2;

import java.util.Scanner;

/**
 * Tge task: 3. Find the roots of the quadratic equation. The parameters of the equation
 * transfer with the command line.
 **/

public class SquareEquation {

	public static double getDiscrimenant(double a, double b, double c) {
		double res = (b * b) - (4 * a * c);
		if (res < 0) {
			System.out.println("the equation don't nave solutions");
			return -1;
		} else
			return res;
	}

	public static double getSolutionOne(double a, double b, double d) {
		if (d != -1)
			return ((-1) * b - Math.sqrt(d)) / (2 * a);
		else {
			System.out.println("the equation don't nave solutions");
			return -1;
		}
	}

	public static double getSolutionTwo(double a, double b, double d) {
		if (d != -1)
			return ((-1) * b + Math.sqrt(d)) / (2 * a);
		else {
			System.out.println("the equation don't nave solutions");
			return -1;
		}
	}

	public static double getSolutionNull(double a, double b) {
		return (-1) * b / (2 * a);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a, b, c, d;
		System.out.println("from equation in form a*x^2 + b*x + c = 0, \nenter the parameter a:");
		;
		a = sc.nextDouble();
		System.out.println("enter the parameter b:");
		;
		b = sc.nextDouble();
		System.out.println("enter the parameter c:");
		;
		c = sc.nextDouble();
		d = getDiscrimenant(a, b, c);
		System.out.println(d);
		if (d == -1)
			System.out.println("the equation don't nave solutions");
		else if (d == 0)
			System.out.println("x= " + getSolutionNull(a, b));
		else
			System.out.println("x1= " + getSolutionOne(a, b, d) + "\nx2= " + getSolutionTwo(a, b, d));
		sc.close();
	}
}
