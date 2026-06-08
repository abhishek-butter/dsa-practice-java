class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int a[]=new int[26];
        int b[]=new int[26];
        
        for(char c:s1.toCharArray()){
            a[c-'a']++;
        }
        
        
        int left=0;
        for(int i=0;i<s2.length();i++){
            char x=s2.charAt(i);
            a[x-'a']--;
            if(i-left+1==s1.length()){
                boolean f2=true;
                for(int j:a){
                    if(j!=0){
                        f2=false ;
                        break;
                    } 

                }
                if(f2)return true;
                a[s2.charAt(left)-'a']++;
                left++;

                
            }

        }
        return false;

        
    }
}