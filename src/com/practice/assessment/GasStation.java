package com.practice.assessment;

public class GasStation {

    private final int[] gas;
    private final int[] cost;

    public GasStation() {
        this.gas = new int[]{1,2,3,4,5};
        this.cost = new int[]{3,4,5,1,2};
    }

    public int canCompleteCircuit() {

        int sumRemaining = 0; // track current remaining
        int total = 0; // track total remaining
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int remaining = gas[i] - cost[i];
            if (sumRemaining >= 0) {
                sumRemaining += remaining;
            } else {
                sumRemaining = remaining;
                start = i;
            }
            total += remaining;
        }

        if (total >= 0){
            return start;
        }else{
            return -1;
        }
    }
}
