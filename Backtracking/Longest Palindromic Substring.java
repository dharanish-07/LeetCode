class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                if (check(s, i, j)) {
                    int len = j - i + 1;

                    if (len > max) {
                        max = len;
                        ans = s.substring(i, j + 1);
                    }
                }
            }
        }

        return ans;
    }

    boolean check(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
