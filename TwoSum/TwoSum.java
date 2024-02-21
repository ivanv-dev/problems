class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueIndex = new HashMap();
        for(int i = 0; i < nums.length; i++){
            Integer neededKey = target - nums[i];
            if(valueIndex.containsKey(neededKey)){
                int[] indexes = {i, valueIndex.get(neededKey)};
                return indexes;
            }
            valueIndex.put(nums[i], i);
        }
        return null;
}
}