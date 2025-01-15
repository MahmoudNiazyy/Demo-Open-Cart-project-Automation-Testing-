// Specify UTF-8 encoding
//-*- coding: utf-8 -*-
package util;

import java.util.Random;

public class UtilityCodes {

    //generate random first name
    public static String generateRandomFirstName() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Only uppercase letters
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }

        return sb.toString();
    }

    //generate random Phone number
    public static String generateRandomPhoneNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        int countryCodeIndex = random.nextInt(3); // Assuming 3 sample country codes
        String[] countryCodes = {"+966", "+91", "+44"};
        sb.append(countryCodes[countryCodeIndex]);

        for (int i = 0; i < 10; i++) {
            sb.append(random.nextInt(10));
        }

        return sb.toString();
    }


    private static final String[] CURRENCIES = {"€Euro", "£Pound Sterling", "$US Dollar"};
    private static final Random RANDOM = new Random();

    // Method to return a random index (1-based) instead of 0-based
    public static int getRandomCurrencyIndex() {
        return RANDOM.nextInt(CURRENCIES.length) + 1; // Offset by 1 to avoid 0
    }


    public static int generateRandomInt(int max) {
        Random rand = new Random();
        return rand.nextInt(max) + 1; // Generate a random number between 0 (inclusive) and 8 (exclusive) and add 1
    }


}







