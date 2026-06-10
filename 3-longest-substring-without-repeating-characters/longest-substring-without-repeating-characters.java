class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean a[]=new boolean[128];
        int left=0;
        int max=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            a[c]=!a[c];


            while(!a[c]){
                a[s.charAt(left)]=!a[s.charAt(left)];
                left++;
                

            }
            max=Math.max(max,i-left+1);

        }
        return max;
        
    }
}