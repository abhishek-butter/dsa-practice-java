class Solution {
    public int maxVowels(String s, int k) {
        int mc=0;
        int c=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i)))c++;
            if(i-l+1>k){
                if(isVowel(s.charAt(l))){
                    c--;
                }
                l++;
            }
            mc=Math.max(mc,c);
            
        }
        return mc;
        

        
    }
    public boolean isVowel(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')?true:false;
    }
}