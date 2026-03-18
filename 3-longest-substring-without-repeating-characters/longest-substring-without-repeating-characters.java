class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxlength=0;

        boolean check[]=new boolean[256];
        int left=0;

        for (int right=0;right<s.length();right++){
            while(check[s.charAt(right)]==true){
                
                check[s.charAt(left)]=false;
                left++;

            }
            maxlength=Math.max(right-left+1,maxlength);
            check[s.charAt(right)]=true;

        }
        return maxlength;
        
    }
}