class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        if(arrivalTime + delayedTime ==24) return 0;
        else if(arrivalTime + delayedTime< 24) return arrivalTime + delayedTime;
        else return (arrivalTime + delayedTime)%24;
    }
}
