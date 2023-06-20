package org.sam;

import java.util.Random;

public class Passwordgeneratorjava {
	public static void main(String[] args) {
		int length=0;
		System.out.println(geek_password(length));
	}

	 static char[] geek_password(int length) {
		 System.out.println("Generating password using random");
		 System.out.println("Your new password is : ");
		 String Captial_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		 String numbers = "0123456789";
		 String Symbols = "*#!@$%^&*()_+=/.?<>";
		 String values = Captial_chars+Small_chars+numbers+Symbols;
		 Random rndm_method = new Random();
		 char[] password = new char[length];
		 for (int i = 0; i < password.length; i++) {
			 password[i] = values.charAt(rndm_method.nextInt(values.length()));
			
		}
		// TODO Auto-generated method stub
		return password;
	}

}
