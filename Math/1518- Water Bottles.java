class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty = numBottles;
        int drank = numBottles;
        while (empty >= numExchange) {
            int newBottles = empty / numExchange;
            drank += newBottles;
            empty = newBottles + (empty % numExchange);
        }
        return drank;
    }
}


// Formula
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles+(numBottles-1)/(numExchange-1);
    }
}
