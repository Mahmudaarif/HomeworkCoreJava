package hw7UseOfNestedIf;

import java.util.Scanner;

public class DiabeticCondition {

	public static void main(String[] args) {
		System.out.println("\"<-- Please Enter your Hemoglobin A1C  value below -");
		Scanner scanner = new Scanner(System.in);
		double hbgalc = scanner.nextDouble();

		if (hbgalc > 6.4) {// Inner if block

			System.out.println("I am a diabetic patient");

		} else {

			if (hbgalc >= 5.7) {// Inner if or nested if block
				System.out.println("I am a pre-diabetic patient");

				if (hbgalc < 5.7) {// Inner if or nested if block
					System.out.println("I am a healthy person");

				}
				scanner.close();

			}

		}

	}

}
