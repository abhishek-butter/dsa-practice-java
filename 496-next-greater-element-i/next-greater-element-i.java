class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums2){
            while(!s.isEmpty() && n>s.peek()){
                map.put(s.pop(),n);
            }
            s.push(n);
        }
        while(!s.isEmpty()){
            map.put(s.pop(),-1);
        }
        int a[]=new int[nums1.length];
        int i=0;
        for(int n:nums1){
            a[i]=map.get(n);
            i++;

        }
        return a;
        
    }
}