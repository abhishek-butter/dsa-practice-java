class Solution {
    public int maxVowels(String s, int k) {
        int maxVowelCount=0;
        int count=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(isVowel(c))count++;
            
            if(right-left+1>k){
                if(isVowel(s.charAt(left)))count--;
                left++;

            }
            maxVowelCount=Math.max(maxVowelCount,count);

        }
        return maxVowelCount;
        
    }
    public boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}