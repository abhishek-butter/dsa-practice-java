class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s=new Stack<>();
        
        int a[]=new int[nums.length];
        Arrays.fill(a,-1);
        for(int i=0;i<2*nums.length;i++){
            while(!s.isEmpty() && nums[i  % nums.length]>nums[s.peek()]){
                a[s.pop()]=nums[i%nums.length];
            }



            if(i<nums.length){
                s.push(i);

            }
            
        }
        return a;
        
    }
}