class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(left++));
                }
            }
            count=Math.max(i-left+1,count);
            set.add(s.charAt(i));

        }
        return count;
        
    }
}