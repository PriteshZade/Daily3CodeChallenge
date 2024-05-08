class Solution {
    static class Pair implements Comparable<Pair>{
        int val ;
        int pos;

        public Pair(int val , int pos){
            this.val = val ;
            this.pos = pos;
        }
        @Override
        public int compareTo(Pair p2) {
            return p2.val - this.val;
        }

    }
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair>pq = new PriorityQueue<>();
        for(int i = 0 ; i < score.length ; i++){
            pq.add(new Pair(score[i],i));

        }
        int i = 1;
        String Ans[]= new String[score.length];
        while(!pq.isEmpty()){
            Pair p = pq.remove();
            int pos = p.pos;
            if(i==1){
                Ans[pos]="Gold Medal";
            }
            else if(i==2){
                Ans[pos]= "Silver Medal";
            }
            else if(i==3){
                Ans[pos] = "Bronze Medal";
            }
            else{
                Ans[pos] =String.valueOf(i);
            }
            i++;
        }
        return Ans;
    }
}