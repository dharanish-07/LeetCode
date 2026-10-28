class Solution {
    public boolean squareIsWhite(String coordinates) {
        char column = coordinates.charAt(0);
        int row = coordinates.charAt(1) - '0';
        
        return ((column - 'a') + row) % 2 == 1;
    }
}