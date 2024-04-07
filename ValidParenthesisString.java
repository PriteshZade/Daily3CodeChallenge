class Solution {
    public boolean checkValidString(String s) {
        Stack<Character>stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)=='('){
                stack.push('(');
            }
            else if(s.charAt(i)==')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }else{
                Stack stack2 = stack;
                String a1 = s.substring(0,i)+"("+s.substring(i+1,s.length());
                boolean a = check(a1,i , stack2);
                a1 = s.substring(0,i)+")"+s.substring(i+1,s.length());
                boolean b = check(a1,i,stack2);
                a1 = s.substring(0,i)+s.substring(i+1,s.length());
                boolean c = check(a1,i+1,stack2);
                return a||b||c;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
    public boolean check(String s,int j , Stack stack){
        for(int i = j ; i < s.length() ; i++){
            if(s.charAt(i)=='('){
                stack.push('(');
            }
            else if(s.charAt(i)==')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }else{
                Stack stack2 = stack;
                String a1 = s.substring(0,i)+"("+s.substring(i+1,s.length());
                boolean a = check(a1,i , stack2);
                a1 = s.substring(0,i)+")"+s.substring(i+1,s.length());
                boolean b = check(a1,i,stack2);
                a1 = s.substring(0,i)+s.substring(i+1,s.length());
                boolean c = check(a1,i+1,stack2);
                return a||b||c;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
    
}