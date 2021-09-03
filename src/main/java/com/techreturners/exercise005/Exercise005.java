package com.techreturners.exercise005;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise005 {

    public boolean isPangram(String input) {

//        return ((input.toLowerCase().chars()
//                .mapToObj(e -> (char) e).filter(c -> c >= 'a' && c <= 'z').collect(Collectors.toSet()).size()) == 26);

       return input.toLowerCase()
                .chars()
                .filter(e->e>='a' && e<='z')
                .mapToObj(e->e)
                .collect(Collectors.toSet()).size()==26;


   // forEach(System.out::println);

//return true;

    }

}
