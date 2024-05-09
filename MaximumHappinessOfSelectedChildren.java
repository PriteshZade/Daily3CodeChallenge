import java.util.*;
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < happiness.length ; i++){
            pq.add(happiness[i]);
        }
        int j = 0 ;
        long sum =0;
        for(int i = 0 ; i < k ; i++){
            int x = pq.remove();
            if(x-j >=0){
                sum = sum + x-j;
            }
            
            
            j++;
        }
        return sum;
    }
}