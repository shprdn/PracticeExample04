package com.stackroute.junitdemo;

public class ReplaceSpecificCharacter {
    public String replace(String string)
    {
        if (string==null)
            return "null not allowed";
        String str; // to store the replacement d->f
        String st; // to store the final replacement l->t
        str = string.toLowerCase().replaceAll("d","f");
        st = str.toLowerCase().replaceAll("l","t");
        return st;

    }
}
