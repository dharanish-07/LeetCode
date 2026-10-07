class Solution {
    static boolean[][] vis;
    static int n, m;

    public int countBattleships(char[][] board) {
        n = board.length;
        m = board[0].length;
        vis = new boolean[n][m];
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (!vis[i][j] && board[i][j] != '.') {
                    c++;
                    dfs(board, i, j);
                }
            }
        }
        return c;
    }

    void dfs(char[][] b, int i, int j) {
        if (i < 0 || i >= n || j < 0 || j >= m || b[i][j] == '.' || vis[i][j])
            return;
        vis[i][j] = true;
        dfs(b, i + 1, j);
        dfs(b, i, j + 1);
        dfs(b, i, j - 1);
        dfs(b, i - 1, j);
    }
}
