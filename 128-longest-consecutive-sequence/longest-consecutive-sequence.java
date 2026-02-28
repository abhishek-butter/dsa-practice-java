class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        for(int n: nums){
            set.add(n);

        }
        int maxl=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int current=n+1;
                int l=1;
                while(set.contains(current)){
                    l++;
                    current++;
                }
                maxl=Math.max(l,maxl);
            }
            
        }
        return maxl;
        
    }
}