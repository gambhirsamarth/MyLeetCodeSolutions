class Solution {
    public boolean rotateString(String s, String goal) {

        // s+s contains all the possible shifts in it, so if target is present in s + s, it is possible to get
        // goal by certain number of shifts else it is not.

        return (s.length() == goal.length() && (s+s).contains(goal));
    }
}
