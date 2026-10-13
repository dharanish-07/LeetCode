class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c = 0;
        for (int i = left; i <= right; i++) {
            int n = Integer.bitCount(i);
            if (isprime(n))
                c++;
        }
        return c;
    }

    boolean isprime(int n) {
        if (n <= 1)
            return false;
        for (int j = 2; j < n; j++) {
            if (j != n && n % j == 0)
                return false;
        }
        return true;
    }
}
