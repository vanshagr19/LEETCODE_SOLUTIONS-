class Solution {
    public int[] twoSum(int[] nums, int key) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0 ; i < nums.length ; i++){
            int a  = key - nums[i];

            if (map.containsKey(a)){
                return new int[]  {i , map.get(a)};
            } 

            map.put(nums[i] , i );
        }
        return new int[]  {}; 
    }
}