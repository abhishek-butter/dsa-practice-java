class Solution {
    public int lengthOfLongestSubstring(String s) {
        char check[]=new char[256];
        int left=0;
        int maxlength=0;
        
        for(int right=0;right<s.length();right++){
            while(check[s.charAt(right)]==1){
                check[s.charAt(left)]=0;
                left++;

            }
            
            check[s.charAt(right)]=1;
            maxlength=Math.max(maxlength,right-left+1);
            

        }
        return maxlength;

        
    }
}