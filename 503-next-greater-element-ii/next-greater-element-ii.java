class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> s=new Stack<>();
        int arr[]=new int[nums.length];
        
        int i=0;
        Arrays.fill(arr,-1);

        while(i<2*nums.length){

            while(!s.isEmpty() && nums[i%nums.length]>nums[s.peek()]){
                arr[s.pop()]=nums[i%nums.length];
            }
            if(i<nums.length)s.push(i);
            
            i++;

        }
        return arr;
        
        
        
    }
}