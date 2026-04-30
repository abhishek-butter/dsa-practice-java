class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean c[]=new boolean[256];
        int max=0;
        
        int left=0;
        for(int right=0;right<s.length();right++){
            while(c[s.charAt(right)]){
                c[s.charAt(left)]=false;
                left++;
            }
            c[s.charAt(right)]=true;
            max=Math.max(max,right-left+1);


        }
        return max;
        
    }
}