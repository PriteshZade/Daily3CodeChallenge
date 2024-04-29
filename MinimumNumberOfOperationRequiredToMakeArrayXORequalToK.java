class Solution {
    public int minOperations(int[] nums, int k) {
        int main = nums[0];
        for(int i = 1 ; i < nums.length ;i++){
            main = main ^nums[i];
        }
        return solve(k,main);

    }
    public  int  solve(int A, int B)
{
    int count = 0;
 
   
    for (int i = 0; i < 32; i++) {
 
    
        if (((A >> i) & 1) != ((B >> i) & 1)) {
            count++;
        }
    }
 
    return count;

}
}