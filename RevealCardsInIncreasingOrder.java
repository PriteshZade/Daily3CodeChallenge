
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer>q = new LinkedList<>();
        for(int i = 0 ; i < deck.length  ; i++){
            q.add(i);
        }
        Arrays.sort(deck);
        int ans[] = new int[deck.length];
        int x ;
        int y;
        int i =0;
        while(!q.isEmpty()){
            if(q.size()==1){
                 x = q.remove();
            }else{
                x = q.remove();
                y = q.remove();
                q.add(y);
            }
            ans[x] =deck[i];
            i++;
        }
        return ans;
    }
}