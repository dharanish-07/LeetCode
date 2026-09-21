class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()==0||s.length()!=goal.length())
            return false;
        String res=s+s;
        return res.contains(goal);
    }
}

// brute force 
class Solution {
    public boolean rotateString(String s, String goal) {
        int k=0;
        for(int j=0;j<s.length();j++)
        {
            String res="";
            k=j%s.length();
            for(int i=k;i<s.length();i++)
                res+=s.charAt(i);
            for(int i=0;i<k;i++)
                res+=s.charAt(i);
            if(res.equals(goal))
                return true;
        }
        return false;
    }
}
