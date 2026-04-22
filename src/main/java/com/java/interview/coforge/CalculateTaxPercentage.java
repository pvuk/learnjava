package com.java.interview.coforge;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Interviewer: Varalakshmi P | Trinet
 * There are two slabs, take one slab and calculate tax, how much he / she needs to pay
 * 
 * Income tax calculation
New Tax Regime
0 - 12 0%
13 - 15 5%
16 - 21 10%
22 - 25 15%
26 and above 30%

 * @author Venkata.Pulipati
 * @since Friday 17-April-2026 15:28:58
 */
public class CalculateTaxPercentage {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			System.out.println("Please enter Salary: ");
			sc = new Scanner(System.in);
			String next = sc.next();
			BigDecimal calculateTax = new BigDecimal(getTaxRate(next));
			BigDecimal income = new BigDecimal(next);
			System.out.println("Tax Amount: "+ income.multiply(calculateTax).divide(BigDecimal.valueOf(100)));
		} finally {
			sc.close();
		}
	}

	public static int getTaxRate(String incomeStr) {

		if (incomeStr == null || !incomeStr.matches("\\d+")) {
	        throw new IllegalArgumentException("Invalid income value");
	    }


		int salary = Integer.parseInt(incomeStr);
		

		return switch (salary) {
			case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 -> 0;
			case 13, 14, 15 -> 5;
			case 16, 17, 18, 19, 20, 21 -> 10;
			case 22, 23, 24, 25 -> 15;
			default -> 30; // 26+
		};

		        //or
		
		/*
		 * Issue Fix:
		 *  Step‑by‑Step: Enable Preview in STS
			1️⃣ Project → Properties
			2️⃣ Java Compiler
			
			Set Compiler compliance level → 21
			✅ Check Enable preview features
			✅ Check Enable preview features for all projects
		
			Enable preview for Run Configuration
	
			Run → Run Configurations
			Select your Java Application
			Open Arguments
			In VM arguments, add:
			
			--enable-preview

		 */
//        return switch (salary) {
//            case int i when i <= 12 -> 0;
//            case int i when i <= 15 -> 5;
//            case int i when i <= 21 -> 10;
//            case int i when i <= 25 -> 15;
//            default -> 30;
//
//        };
    }

}
