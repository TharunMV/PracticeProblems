package com.practice.assessment;

public class Main {

    public static void main(String[] args) {

        System.out.println(new TrapWater().getTrappedWater());
        System.out.println("*****");
        System.out.println(EliminationGame.lastRemaining(4));
        System.out.println("*****");
        System.out.println(SubstringPattern.containsOnlySubstringsEfficient("jojo"));
        System.out.println("*****");
        System.out.println(new GasStation().canCompleteCircuit());
        System.out.println("*****");
        System.out.println(CoinChange.coinChange(new int[]{1,2,5}, 11));
        System.out.println("*****");
        System.out.println(new MissingNumber().missingNumber());
        System.out.println("*****");
        System.out.println(ValidParentheses.isValid("(abc){}{}[]"));
    }
}
