class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int m : nums ){
            if (set.contains(m))
            return true;

            set.add(m);
        }
        return false;
    }
}