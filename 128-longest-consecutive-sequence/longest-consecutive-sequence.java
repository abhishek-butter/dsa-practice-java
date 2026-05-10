class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int length=0;
        for(int n:nums){
            set.add(n);
        }
        for(int n:set){

            if(!set.contains(n-1)){
                int s=n;
                int count=1;
                while(set.contains(s+1)){
                    count++;
                    s=s+1;
                }
                length=Math.max(length,count);
            }
        }
        return length;

        
    }
}