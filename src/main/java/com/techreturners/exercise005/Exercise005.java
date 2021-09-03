package com.techreturners.exercise005;

import java.util.stream.Collectors;

public class Exercise005 {

    public boolean isPangram(String input) {

        return ((input.toLowerCase().chars()
                .mapToObj(e -> (char) e).filter(c -> c >= 'a' && c <= 'z').collect(Collectors.toSet()).size()) == 26);

    }

}
