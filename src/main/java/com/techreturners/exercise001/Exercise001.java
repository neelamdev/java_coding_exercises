package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {

    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        double calculatedPrice = originalPrice + originalPrice * vatRate / 100;
        return Double.parseDouble(String.format("%.2f", calculatedPrice));
    }

    public String reverse(String sentence) {
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        return (int) users.stream().filter(e -> e.getType().equals("Linux")).count();
    }
}
