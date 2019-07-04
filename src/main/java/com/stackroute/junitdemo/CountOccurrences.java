package com.stackroute.junitdemo;

public class CountOccurrences {
    public int count(String string, String character)
    {
        //if String is null,return 0
        if (string==null)
            return 0;

        //calculate the initial length of string
        int initialLength = string.length();
        int finalLength;
        String st = string.toLowerCase().replaceAll(character,""); // replacing given character with ""
        finalLength = st.length();
        int frequency = initialLength-finalLength; // length of the new string
        return frequency;

    }
}
