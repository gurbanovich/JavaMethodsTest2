package var2;

import java.util.Scanner;

/**
 * The task: 1. Determine the belonging of some value of k to the intervals (n,
 * m], [n, m), (n, m), [n, m].
 **/

public class BelongInterval {

	public static void inIntervalStrict(String k, String n, String m) {
		if (Integer.parseInt(k) > Integer.parseInt(n) && Integer.parseInt(k) < Integer.parseInt(m))
			System.out.println(k + " in the interval (" + n + ": " + m + ").");
		else
			System.out.println(k + " not in the interval (" + n + ": " + m + ").");
	}

	public static void inIntervalSemiStrictStart(String k, String n, String m) {
		if (Integer.parseInt(k) > Integer.parseInt(n) && Integer.parseInt(k) <= Integer.parseInt(m))
			System.out.println(k + " in the interval (" + n + ": " + m + "].");
		else
			System.out.println(k + " not in the interval (" + n + ": " + m + "].");
	}

	public static void inIntervalSemiStrictEnd(String k, String n, String m) {
		if (Integer.parseInt(k) >= Integer.parseInt(n) && Integer.parseInt(k) < Integer.parseInt(m))
			System.out.println(k + " in the interval [" + n + ": " + m + ").");
		else
			System.out.println(k + " not in the interval [" + n + ": " + m + ").");
	}

	public static void inIntervalNotStrict(String k, String n, String m) {
		if (Integer.parseInt(k) >= Integer.parseInt(n) && Integer.parseInt(k) <= Integer.parseInt(m))
			System.out.println(k + " in the interval [" + n + ": " + m + "].");
		else
			System.out.println(k + " not in the interval [" + n + ": " + m + "].");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("puts the kind of interval \n1. k belongs (n; m); "
				+ "\n2. k belongs (n; m]; \n3. k belongs [n; m)2; \n4. k belongs [n; m];");
		String kindOfInterval = scan.next();
		System.out.println("puts the parameters k;");
		String k = scan.next();
		System.out.println("puts the parameters n;");
		String n = scan.next();
		System.out.println("puts the parameters m;");
		String m = scan.next();

		switch (kindOfInterval) {
		case "1":
			inIntervalStrict(k, n, m);
			break;
		case "2":
			inIntervalSemiStrictStart(k, n, m);
			break;
		case "3":
			inIntervalSemiStrictEnd(k, n, m);
			break;
		case "4":
			inIntervalNotStrict(k, n, m);
			break;
		default:
			System.out.println("puts correct parameters;");
		}
		scan.close();
	}

}
