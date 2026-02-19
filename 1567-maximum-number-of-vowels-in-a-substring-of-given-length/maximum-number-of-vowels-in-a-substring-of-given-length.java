class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int m=0;
        int c=0;
        
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                c++;
            }
            if(i-l+1>k){
                if(isVowel(s.charAt(l))){
                    c--;
                }
                l++;

            }
            m=Math.max(m,c);
            
        }
        return m;
        
    }
    private boolean isVowel(char ch){

        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}