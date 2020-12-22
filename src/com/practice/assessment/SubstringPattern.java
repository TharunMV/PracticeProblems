package com.practice.assessment;

public class SubstringPattern {

    public static boolean containsOnlySubstringsEfficient(String string) {
        String str = string + string;
        return str.substring(1, str.length() - 1).contains(string);
    }
}
