class Solution {
    class Pair implements Comparable<Pair>{
        int q ;
        int w;
        double fra;
        
        public Pair(int q , int w , double fra){
            this.q = q ; 
            this.w = w;
            this.fra = fra;
        }
        @Override
        public int compareTo(Pair p2){
            // Compare fractions based on their float value
            return Double.compare(this.fra, p2.fra);
        }
    }
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        // TreeMap<Integer,Integer>hm = new TreeMap<>();
        // for(int i = 0 ; i < quality.length ; i++){
        //     hm.put(quality[i] , wage[i]);
        // }
        int arr[][]=new int[quality.length][2];
        for(int i = 0 ; i < quality.length ; i++){
            arr[i][0]= i;
            arr[i][1] = quality[i];
        }
        //Arrays.sort(arr, (a, b) -> Integer.compare(a[col],b[col]));
         Comparator<int[]> customComparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]); // Sort based on the first column
            }
        };
        Arrays.sort(arr, customComparator);
        //Set<Integer>keySet = hm.keySet();
        PriorityQueue<Pair>pq = new PriorityQueue<>();
        for(int i = 0 ; i < quality.length ; i++){
            double f  = (double)wage[i]/quality[i];
            pq.add(new Pair(quality[i],wage[i],f));

        }
        double min = Double.MAX_VALUE;
        while(!pq.isEmpty()){
            Pair newPair = pq.remove();
            //float f = newPair.fra;
            double Sum = 0;
            int count =0;
            for(int i = 0 ; i < quality.length ; i++){
                if(arr[i][1] == newPair.q && wage[arr[i][0]]==newPair.w){
                     Sum = Sum + wage[arr[i][0]];
                     count++;
                }
                else if(((double)newPair.w/newPair.q)*arr[i][1]>=wage[arr[i][0]]){

                    Sum = Sum + ((double)newPair.w/newPair.q)*arr[i][1];
                    count++;
                }
                if(count==k){
                    min = Math.min(min,Sum);
                    //break;
                }
            }
        }
        return min;
    }
}