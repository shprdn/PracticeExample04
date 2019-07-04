package com.stackroute.junitdemo;

import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurrence {
    public String matchingPattern(String string,String word){
        //when string is null
        if (string==null)
        {
            return "null";
        }
        String s="";
        Pattern pat = Pattern.compile("(" + word +")+"); // Pattern Matcher
        Matcher mat = pat.matcher(string);
        while (mat.find())
        {
            s = s + "found at "+mat.start() + "-" +(mat.end()-1)+"\n";   //finding the start and end occurrence of string

        }
        return s.trim();
    }
}
