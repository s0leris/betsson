package com.betsson.FE.core.functions;


import java.security.SecureRandom;
import java.util.Random;

public class Generator {

		private static final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		private static final String numbers = "0123456789";

	    public static String generateRandomString(int length) {
	        Random random = new SecureRandom();
	        if (length <= 0) {
	            throw new IllegalArgumentException("String length must be a positive integer");
	        }

	        StringBuilder sb = new StringBuilder(length);
	        for (int i = 0; i < length; i++) {
	            sb.append(characters.charAt(random.nextInt(characters.length())));
	        }

	        return sb.toString();
	    }
	    
	    
	    public static String generateRandomNumbers(int length) {
	        Random random = new SecureRandom();
	        if (length <= 0) {
	            throw new IllegalArgumentException("String length must be a positive integer");
	        }

	        StringBuilder sb = new StringBuilder(length);
	        for (int i = 0; i < length; i++) {
	            sb.append(numbers.charAt(random.nextInt(characters.length())));
	        }

	        return sb.toString();
	    }
	    		
	}
