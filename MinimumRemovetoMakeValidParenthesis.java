class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character>stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            //Character c = s.charAt(i);
            if(s.charAt(i)=='('){
                sb.append(s.charAt(i));
                stack.push('(');
            }

            else if(s.charAt(i)==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                    sb = sb.append(s.charAt(i));
                }
            }
            else {
                sb = sb.append(s.charAt(i));
            }
        }
        
        if(!stack.isEmpty()){
            while(!stack.isEmpty()){
            stack.pop();
        }
            StringBuilder sb2 = new StringBuilder();

            for(int i = sb.length()-1 ; i>=0;i--){
                if(sb.charAt(i)==')'){
                    sb2.append(sb.charAt(i));
                    stack.push(')');
                }

                else if(sb.charAt(i)=='('){
                    if(!stack.isEmpty()){
                        stack.pop();
                        sb2 = sb2.append(sb.charAt(i));
                    }
                }
                else {
                    sb2 = sb2.append(sb.charAt(i));
                }
            }
            return sb2.reverse().toString();
        }
        return sb.toString();
    }
}