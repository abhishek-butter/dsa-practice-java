class Solution {
    public int characterReplacement(String s, int k) {
        int f[]=new int[128];
        int left=0;
        int mf=0;
        int ml=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            f[c]++;
            mf=Math.max(f[c],mf);

            if(i-left+1-mf>k){
                 f[s.charAt(left)]--;
                 left++;
            }
            ml=Math.max(ml,i-left+1);
        }
        return ml;
        
    }
}