package com.practice.assessment;

public class TrapWater {

    private final int[] blockLocations;

    public TrapWater() {
        this.blockLocations = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
    }

    public int getTrappedWater() {

        int totalWaterCount = 0;
        int[] left = new int[blockLocations.length];
        int[] right = new int[blockLocations.length];
        
        //left side
        int maxHeight = blockLocations[0];
        left[0] = maxHeight;
        for(int i=1; i<blockLocations.length; i++) {
            if(blockLocations[i] < maxHeight)
                left[i] = maxHeight;
            else {
                left[i] = blockLocations[i];
                maxHeight = blockLocations[i];
            }
        }

        //right side
        maxHeight = blockLocations[blockLocations.length - 1];
        right[blockLocations.length - 1] = maxHeight;
        for(int i=blockLocations.length-2; i>=0; i--) {
            if(blockLocations[i] < maxHeight)
                right[i] = maxHeight;
            else {
                right[i] = blockLocations[i];
                maxHeight = blockLocations[i];
            }
        }

        for(int i=0; i<blockLocations.length;i++) {
            totalWaterCount += Math.min(left[i], right[i]) - blockLocations[i];
        }

        return totalWaterCount;
    }
}
