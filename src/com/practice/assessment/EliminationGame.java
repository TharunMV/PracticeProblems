package com.practice.assessment;

public class EliminationGame {

    public static int lastRemaining(int n) {
        if(n == 1)
            return 1;
        else if(n <= 5)
            return 2;
        else
            return (n/2 - (lastRemaining(n/2) - 1)) * 2;
    }
}
