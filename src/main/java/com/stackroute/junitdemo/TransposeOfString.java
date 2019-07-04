package com.stackroute.junitdemo;

import java.util.Arrays;

public class TransposeOfString {
    public String reverse(String string){
        //if String is null
        if (string==null)
            return null;
        // store string in a string array after splitting
        String[] word = string.split("\\s|\\.|,|;");

      //  String str;

        int i=0;
        String wordArray="";

        for (String str : word)
        {
            StringBuilder sb = new StringBuilder(str);
            wordArray = wordArray + sb.reverse()+" ";
            //System.out.print(wordArray);

        }
        return wordArray.trim();

    }
}
