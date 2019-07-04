package com.stackroute.junitdemo;

public class RegularExpression {
    public boolean search(String string, String st){
        if (string==null || st==null)
            return false;
        String[] arr = string.split("\\s|\\.|,|;");
        for(String str : arr)
        {
            if (str.contains(st))
                return true;

        }
        return false;
    }

}
