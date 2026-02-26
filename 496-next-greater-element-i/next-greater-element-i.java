class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int a[]=new int[nums1.length];

        for(int j=0;j<nums1.length;j++){

            a[j]=finder(nums1[j],nums2);
        }
        return a;
        


        
    }
    public int finder(int a,int[] b){
        for(int i=0;i<b.length;i++){
            if(b[i]==a){
                
                
                while(i<b.length){
                    
                    if(b[i]>a){
                        return b[i];

                    }
                    i++;

                }

            }
        }
        return -1;
    }
}