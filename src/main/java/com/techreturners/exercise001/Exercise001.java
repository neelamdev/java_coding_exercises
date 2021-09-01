package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {

    public String capitalizeWord(String word) {
        char firstChar=Character.toUpperCase(word.charAt(0));
        String subString =word.substring(1);
        return firstChar+subString;
    }

    public String generateInitials(String firstName, String lastName) {
        char firstChar=Character.toUpperCase(firstName.charAt(0));
        char lastNameChar=Character.toUpperCase(lastName.charAt(0));
        return firstChar+"."+lastNameChar;
    }

    public double addVat(double originalPrice, double vatRate) {

        double calculatedPrice;
        double finalResult;
        calculatedPrice= Math.round((originalPrice + originalPrice * vatRate/ 100)*100);
        finalResult = calculatedPrice/100;
        return finalResult;
    }

    public String reverse(String sentence) {
        StringBuilder RevSentence =new StringBuilder(sentence).reverse();
        return RevSentence.toString();
    }

    public int countLinuxUsers(List<User> users) {
        int userCount;
        userCount = 0;

        //users.forEach(u-> System.out.println(u.getType()));
        for (User u : users )
        {
            if(u.getType().equals("Linux"))
                userCount++;
            //System.out.println(userCount);
        }

        return userCount;
    }
}
