class Solution {
    public static int maxDepth(String s) {
        Stack<Character>stack = new Stack<>();
        int size=0;
        int count = 0;
        int arr[] = new int[101];
        int max = 0;
        // if(s.equals("()")){
        //     return 1;
        // }
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i)=='(')
            {
                stack.push('(');
                size++;
                count = 2;
            }
            else if(s.charAt(i)==')'){
                if(count==2){
                    max = Math.max(max,size);
                }
                stack.pop();
                size--;
                count =4;
            }
            else{
                
                    max = Math.max(max,size);
                    count=1;
            }
        }
        // for(int i = 0 ; i < 101 ; i++){
        //     max = Math.max(max,arr[i]);
        // }
        return max;
    }

	public static void main (String args[]){
		maxDepth("()";
	}
}