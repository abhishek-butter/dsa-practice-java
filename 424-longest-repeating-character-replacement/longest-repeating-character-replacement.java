class Solution {
    public int characterReplacement(String s, int k) {

        int maxlength=0;
        int left=0;
        int f[]=new int[26];
        int mostfreq=0;

        for(int right=0;right<s.length();right++){
            char a=s.charAt(right);

            

            f[a-'A']++;
            mostfreq=Math.max(f[a-'A'],mostfreq);

            if(right-left+1-mostfreq>k){
                
                char l=s.charAt(left);
                f[l-'A']--;
                left++;
            }

            maxlength=Math.max(maxlength,right-left+1);
            
        }
        return maxlength;
        
    }
}