class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean check[]=new boolean[256];
        int maxlength=0;
        int left=0;

        for(int i=0;i<s.length();i++){
            while(check[s.charAt(i)]){
                check[s.charAt(left)]=false;
                left++;
            }
            check[s.charAt(i)]=true;

            maxlength=Math.max(i-left+1,maxlength);

            

        }
        return maxlength;
        
    }
}