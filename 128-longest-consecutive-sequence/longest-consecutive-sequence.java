class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        for(int n:nums){
            
            set.add(n);
        }
        int maxlength=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int c=n;
                int l=1;
                while(set.contains(c+1)){
                    l++;
                    c++;

                }
                maxlength=Math.max(maxlength,l);
            }
            
        }
        return maxlength;
        
    }
}