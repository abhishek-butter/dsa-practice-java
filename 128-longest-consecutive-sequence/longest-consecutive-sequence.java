class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        
        HashSet<Integer> map=new HashSet<>();
        for(int n:nums){

            map.add(n);
        }
        
        
        int maxcount=0;
        
        
        for(int n:map){
            if(!map.contains(n-1)){
                int c=n;
                int count=1;
                while(map.contains(c+1)){
                    c++;
                    count++;

                }
                maxcount=Math.max(maxcount,count);


                
                
                
            }
        }
        
        
        return maxcount;

    }
}