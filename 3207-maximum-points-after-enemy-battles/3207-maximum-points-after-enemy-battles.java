class Solution {
    public long maximumPoints(int[] enemyEnergies, int currentEnergy) {
        long sum=0;
        int minmum= Integer.MAX_VALUE;
        for(int energy : enemyEnergies){
            sum+=energy;
            minmum=Math.min(minmum,energy);
        }
        if(currentEnergy<minmum){
            return 0;
        }
        return (currentEnergy+sum-minmum)/minmum;
    }
}