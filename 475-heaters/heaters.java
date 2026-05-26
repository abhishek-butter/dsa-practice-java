class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        PriorityQueue<Integer> l=new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(heaters);

        for(int i:houses){
            l.add(BS(heaters,0,heaters.length-1,i));
            
            
        }
        return l.peek();
        
        
    }
    public int BS(int[] arr,int i,int j,int t){
            
            int left=i;
            int right=j;
            int found=arr.length;
            while(left<=right){
                int mid=(left+right)/2;
                if(arr[mid]>=t){
                    found=mid;
                    right=mid-1;

                    
                } 
                else{
                    left=mid+1;
                }

            }
            if (found==0)return Math.abs(t-arr[found]);
            if (found==arr.length)return Math.abs(t-arr[found-1]); 
            return Math.min(Math.abs(t-arr[found]),Math.abs(t-arr[found-1]));

    }
}