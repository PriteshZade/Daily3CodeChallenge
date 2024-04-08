class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer>st = new LinkedList<Integer>();
        for(int i = 0 ; i < students.length ; i++){
            st.add(students[i]);
        }
        Stack<Integer>sa = new Stack<Integer>();
        for(int i =  students.length-1 ; i >=0 ; i--){
            sa.add(sandwiches[i]);
        }
        int count=0;
        while(!st.isEmpty())
        {
            int stTop = st.remove();

            if(stTop !=sa.peek()) {
                count++;
                st.add(stTop);
                if(count==st.size()){
                    return count;
                }
            }
            else{
                sa.pop();
                count=0;
            }

        }
        return 0;
        
    }
}