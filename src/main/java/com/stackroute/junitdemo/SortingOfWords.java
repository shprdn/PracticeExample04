package com.stackroute.junitdemo;

import java.util.Arrays;
import java.util.Collections;

public class SortingOfWords {
    public String sorting(String string) {
        String out="";
        //if string is null
        if (string == null)
            return null;
        // wordArray stores the word of the given string
        String[] wordArray;
        wordArray = string.split("\\s+|\\.|,|;");
        for (int i = 0; i < wordArray.length; i++) {
            Collections.sort(Arrays.asList(wordArray), String.CASE_INSENSITIVE_ORDER);  // sorting the given array of strings
            StringBuilder sb = new StringBuilder();
            sb.append(Arrays.asList(wordArray));
            out= sb.toString().replaceAll(",|\\[|\\]",""); //replacing any special character if found in the string
        }

        return out;
    }
}
