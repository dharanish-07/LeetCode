class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> li = new ArrayList<>();
        li.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int last[] = li.get(li.size() - 1);
            int cur[] = intervals[i];
            if (cur[0] <= last[1])
                last[1] = Math.max(cur[1], last[1]);
            else
                li.add(intervals[i]);
        }
        return  li.toArray(new int[li.size()][]);
    }
}