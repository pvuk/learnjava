package com.practice.java.condition.forloop;

import java.util.Scanner;

/**
 * 1. rightsOverride = true
 * 
 * @author P V UdayKiran
 *
 * @Date: Fri 15-Nov-2019 21:30
 */
public class PrintValuesBasedOnArrayValueCondition {
	public static void main(String[] args) {
		Boolean rightsOverride = null, paymentsOverride = null, noOverride = null, servicingOverride = null;
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Select Rights Override 1/0: ");
			int filterRights = scanner.nextInt();
			filterRights = filterRights == 1 ? 1 : 0;

			System.out.print("Select Payments Override 1/0: ");
			int filterPayments = scanner.nextInt();
			filterPayments = filterPayments == 1 ? 2 : 0;

			System.out.print("Select No Override 1/0: ");
			int filterNoOverride = scanner.nextInt();
			filterNoOverride = filterNoOverride == 1 ? 3 : 0;

			System.out.print("Select Servicing Override 1/0: ");
			int filterServicing = scanner.nextInt();
			filterServicing = filterServicing == 1 ? 4 : 0;

			int[] filters = { filterRights, filterPayments, filterNoOverride, filterServicing };
			//Apply value condition
			for (int i = 0; i < filters.length; i++) {
				if (filters[i] == 1) {
					rightsOverride = Boolean.TRUE;
				} else if (filters[i] == 2) {
					paymentsOverride = Boolean.TRUE;
				} else if (filters[i] == 3) {
					rightsOverride = Boolean.FALSE;
					paymentsOverride = Boolean.FALSE;
					servicingOverride = Boolean.FALSE;
				} else if (filters[i] == 4) {
					servicingOverride = Boolean.TRUE;
				}
			}
			System.out.println(rightsOverride +", "+ paymentsOverride +", "+ noOverride +", "+ servicingOverride);
		} finally {
			scanner.close();
		}
	}
}
