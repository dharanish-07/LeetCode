class Solution {
    public List<Integer> findGoodIntegers(int n) {
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        int cuberoot=(int)Math.cbrt(n);
        for(int i=1;i<=cuberoot;i++)
        {
            int a3=i*i*i;
        for(int j=i;j<=cuberoot;j++)
            {
            int sum=a3+(j*j*j);
            if(sum<=n)
                {
                 h.put(sum,h.getOrDefault(sum,0)+1);
                }
                else break;
            }
        }
        for(int x:h.keySet())
        {
            if(h.get(x)>1)
            {
                l.add(x);
            }
        }
        Collections.sort(l);
        return l;
    }
}