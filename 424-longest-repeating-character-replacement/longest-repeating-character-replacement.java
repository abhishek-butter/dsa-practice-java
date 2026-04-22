class Solution {
    public int characterReplacement(String s, int k) {

        int maxlength=0;
        int left=0;
        int f[]=new int[128];
        int mostfreq=0;

        for(int right=0;right<s.length();right++){
            char a=s.charAt(right);

            

            f[a]++;
            mostfreq=Math.max(f[a],mostfreq);

            if(right-left+1-mostfreq>k){
                
                char l=s.charAt(left);
                f[l]--;
                left++;
            }

            maxlength=Math.max(maxlength,right-left+1);
            
        }
        return maxlength;
        
    }
}