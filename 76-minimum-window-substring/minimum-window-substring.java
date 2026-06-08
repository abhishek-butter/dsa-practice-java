class Solution {
    public String minWindow(String s, String t) {
        int present[]=new int[128];
        for(char c:t.toCharArray()){
            present[c]++;
        }
        int req=t.length();
        int left=0;
        int v=99999999;
        String ans="";
        
        for(int i=0;i<s.length();i++){
            if(present[s.charAt(i)]>0){
                

                req--;
            }
            present[s.charAt(i)]--;
            
            while(req==0){
                if(i-left+1<v){
                    ans=s.substring(left,i+1);
                    v=i-left+1;
                }             
                present[s.charAt(left)]++;
                if(present[s.charAt(left)]>0)req++;
                left++;

            }
            

        }
        return ans;
        
    }
}