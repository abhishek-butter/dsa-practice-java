class Solution {
    public int characterReplacement(String s, int k) {
        int f[]=new int[126];
        int maxf=0;
        int maxlength=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            f[s.charAt(right)]++;

            maxf=Math.max(f[s.charAt(right)],maxf);
            if(right-left+1-maxf >k){
                f[s.charAt(left)]--;
                left++;
            }
            
            maxlength=Math.max(right-left+1,maxlength);
        }
        return maxlength;
        
    }
}