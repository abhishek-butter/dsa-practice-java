class Solution {
    public String minWindow(String s, String t) {
        int present[]=new int[126];
        for(char c:t.toCharArray()){
            present[c-'A']++;
        }
        int req=t.length();
        int left=0;
        int v=99999999;
        String ans="";
        
        for(int i=0;i<s.length();i++){
            if(present[s.charAt(i)-'A']>0){
                

                req--;
            }
            present[s.charAt(i)-'A']--;
            
            while(req==0){
                if(i-left+1<v){
                    ans=s.substring(left,i+1);
                    v=i-left+1;
                }             
                present[s.charAt(left)-'A']++;
                if(present[s.charAt(left)-'A']>0)req++;
                left++;

            }
            

        }
        return ans;
        
    }
}