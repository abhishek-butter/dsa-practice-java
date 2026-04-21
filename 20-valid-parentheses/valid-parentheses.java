class Solution {
    public boolean isValid(String s) {
        Deque<Character> d=new ArrayDeque<>();
        if(s.length()==0)return true;
        

        for(char c:s.toCharArray()){

            if(c=='('||c=='['||c=='{')d.push(c);
            else{
                if(d.isEmpty())return false;
                char top=d.pop();

                
                if(c==')' && top!='(')return false;
                if(c==']' && top!='[')return false;
                if(c=='}' && top!='{')return false;

            }

        }
        return d.isEmpty();
        
    }
}