class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i : set){
            if(!set.contains(i-1)){
                int n=i;
                int l=1;               
                while(set.contains(++n))l++;  
                max=Math.max(max,l);
                
            }
        }
        return max;
        
    }
}