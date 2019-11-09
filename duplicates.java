//return true if there are duplicates

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int i : nums){
            if(!seen.contains(i)){
                seen.add(i);
            }else{
                return true;
            }
        }
        return false;
    }
}
