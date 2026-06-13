class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String i:tokens){

            if(s.size()>1 && i.equals("+")||i.equals("-")||i.equals("*")||i.equals("/")){
                int b=s.pop();
                int a=s.pop();
                if(i.equals("+")){
                    s.add(a+b);
                    continue;
                }
                if(i.equals("-")){
                    s.add(a-b);
                    continue;
                }
                if(i.equals("*")){
                    s.add(a*b);
                    continue;
                }
                if(i.equals("/")){
                    s.add(a/b);
                    continue;
                }
            }

            s.add(Integer.parseInt(i));
            
            
        }
        return s.peek();
        
    }
}