class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> c=new HashSet<>();
        int l=0;
        int ml=0;
        for(int i=0;i<s.length();i++){
            while(c.contains(s.charAt(i))){
                c.remove(s.charAt(l));
                l++;

            }
            c.add(s.charAt(i));
            ml=Math.max(ml,i-l+1);
        }
       return ml;
    }
}