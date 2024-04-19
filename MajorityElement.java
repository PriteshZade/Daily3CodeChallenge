class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm= new HashMap<>();
        for(int i =0 ; i < nums.length ; i++){
            if(hm.get(nums[i])!=null){
                
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
            
        }
        Set<Integer>s = hm.keySet();
        for(Integer i : s){
            if(hm.get(i)>nums.length/2){
                return i;
            }
        }
        return 0;
    }
}