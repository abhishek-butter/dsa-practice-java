class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String i:tokens){
            if(s.size()>1){
                int b=s.pop();
                int a=s.pop();
                if(i.equals("+")){
                    s.add(a+b);
                    continue;
                }
                else if(i.equals("-")){
                    s.add(a-b);
                    continue;
                }
                else if(i.equals("*")){
                    s.add(a*b);
                    continue;
                }
                else if(i.equals("/")){
                    s.add(a/b);
                    continue;
                }
                else{
                    s.add(a);
                    s.add(b);
                }

            }

            s.add(Integer.parseInt(i));
        }
        return s.peek();
        
    }
}