package com.techreturners.exercise001;

import java.util.List;
import java.util.stream.Stream;

public class Exercise001 {

    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0))+word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0))+"."+Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {

        double calculatedPrice= (Math.round((originalPrice + originalPrice * vatRate/ 100)*100));
        return calculatedPrice/100;
        //return finalResult;
    }

    public String reverse(String sentence) {
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
       return (int)users.stream().filter(e -> e.getType().equals("Linux")).count();
//        return (int) linuxCount;
    }
}
