package com.redington.java.Basics;

import java.util.Scanner;

public class IncomeTaxCalculator {

	double income, income1;

	void getinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your income");
		income = sc.nextDouble();
	}

	void calculation() {
		if (income > 20000) {
			income1 = income - 20000;
			// income2=income1-20000;
			// income3=income-20000;

			if (income1 < 20000) {
				double tax = (income1 * 10) / 100;
				System.out.println("tax for ur income rs." + income + " is " + tax);
			} else if (income1 > 20000 && income1 <= 40000) {
				double income2 = income1 - 20000;
				double rate1 = (20000 * 10) / 100;
				double rate2 = (income2 * 20) / 100;
				double tax1 = rate1 + rate2;
				System.out.println("tax for ur income rs." + income + " is " + tax1);
			} else if (income1 > 40000) {
				double income3 = income1 - 40000;

				double rate3 = (20000 * 10) / 100;
				double rate4 = (20000 * 20) / 100;
				double rate5 = (income3 * 30) / 100;

				double tax2 = rate3 + rate4 + rate5;

				System.out.println("tax for ur income rs." + income + " is " + tax2);
			}
		} else {
			System.out.println("tax for ur income rs." + income + " is no tax");
		}

	}

}
