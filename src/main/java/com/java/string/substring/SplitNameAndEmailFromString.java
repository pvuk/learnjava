package com.java.string.substring;

/**
 * Split Name and Email from String.
 * 
 * @author venkataudaykiranp
 * @version 1, changes on Tue 03-Mar-2020 16:32
 * @version 1.0
 */
public class SplitNameAndEmailFromString {
	public static void main(String[] args) {
		String nameSplit = "Jongmin YuJongmin.Yu@fox.com\r\n" +
				"Jean YuanJean.Yuan@fox.com\r\n" +
				"Sean YuanSean.Yuan@fox.com\r\n" +
				"Charmaine YuenCharmaine.Yuen@disney.com\r\n" +
				"Hanna ZarebaHANNA.ZAREBA@DISNEY.COM\r\n" +
				"Michael ZeeMichael.Zee@fox.com\r\n" +
				"Christina ZhangChristina.Zhang@fox.com\r\n" +
				"Xuting ZhangXuting.Zhang@fox.com\r\n" +
				"Emily ZhangEmily.Zhang@disney.com\r\n" +
				"Kelly ZhangKelly.Zhang@disney.com\r\n" +
				"Doris ZhangDORIS.ZHANG@DISNEY.COM\r\n" +
				"Shawn ZhangSHAWN.ZHANG@DISNEY.COM\r\n" +
				"Derek ZielinDerek.Zielin@fox.com\r\n" +
				"";
		String[] split = nameSplit.split("\r\n");
		StringBuilder sbF = new StringBuilder();
		StringBuilder sbL = new StringBuilder();
		try {
			for(String s : split) {
//				System.out.println(s);
				String[] name = s.split(" ");
				String firstName = name[0];
				String lastName = name[1];
//				System.out.println(firstName);
				String dF = firstName.toLowerCase();
				String dL = lastName.toLowerCase();
				int lIndex = dL.indexOf(dF);//get Index from lastName
				String substring = lastName.substring(lIndex); // get only email
				String nameSubstring = lastName.split(substring)[0];// get only lastName from mix part of (lastName and email)
//				System.out.println(firstName +" "+ nameSubstring +" "+ substring);
//				System.out.println(firstName +" "+ nameSubstring);
				sbF.append(firstName +" "+ nameSubstring+"\n");
//				System.out.println(substring);
				sbL.append(substring+"\n");
//				String[] email = lastName.toLowerCase().split(firstName.toLowerCase());
//				System.out.println(email[1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(sbF.toString());
			System.out.println(sbL.toString());
		}
	}
}
