class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int length=0;
        int[]freq=new int[26];
        int mf=0;

        for(int i=0;i<s.length();i++){  
            char c=s.charAt(i);          
            mf=Math.max(mf,++freq[c-'A']);
            while((i-l+1)-mf>k){
                    freq[s.charAt(l)-'A']--;
                    l++;
                }
                length=Math.max(length,i-l+1);            
        }
        return length;
        
    }
   
}