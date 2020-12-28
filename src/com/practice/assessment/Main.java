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
        System.out.println("*****");
        System.out.println(WildcardMatch.isMatch("acdeb", "*a?d*b"));
        System.out.println("*****");
        String[] words = {
                "CARS", "REPAID", "DUES", "NOSE", "SIGNED", "LANE",
                "PAIRED", "ARCS", "GRAB", "USED", "ONES", "BRAG",
                "SUED", "LEAN", "SCAR", "DESIGN"
        };
        GroupAnagrams.groupAnagrams(words);
        System.out.println("*****");
        System.out.println("\nLinked List Implementation");
        System.out.println("**************************\n");
        SinglyLinkedList myLinkedList = new SinglyLinkedList();
        myLinkedList.insertFirst(5);
        myLinkedList.insertFirst(6);
        myLinkedList.insertFirst(7);
        myLinkedList.insertFirst(1);
        myLinkedList.insertLast(2);
        myLinkedList.deleteFirst();
        Node node=new Node();
        node.data=7;
        myLinkedList.deleteAfter(node);
        myLinkedList.printLinkedList();
    }
}
