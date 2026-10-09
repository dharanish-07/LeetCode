class Solution {
    static boolean[] vis;
    List<StringBuilder> res = new ArrayList<>();
    StringBuilder r = new StringBuilder();

    public String getPermutation(int n, int k) {
        vis = new boolean[n + 1];
        find(n);
        return res.get(k - 1).toString();
    }

    public void find(int n) {
        if (r.length() == n) {
            res.add(new StringBuilder(r));
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i])
                continue;
            r.append(i);
            vis[i] = true;
            find(n);
            vis[i] = false;
            r.deleteCharAt(r.length() - 1);
        }
        return;
    }
}
