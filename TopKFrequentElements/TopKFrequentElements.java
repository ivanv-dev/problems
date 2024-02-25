class TopKFrequentElements {
  public int[] topKFrequent(int[] nums, int k) {
    Set < Integer > [] bucket = new Set[nums.length];
    Map < Integer, Integer > map = new HashMap();
    List < Integer > output = new ArrayList();
    int counter = k;

    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }

    for (int i = 0; i < nums.length; i++) {
      var occurance = map.get(nums[i]);
      if (bucket[occurance - 1] != null && bucket[occurance - 1].contains(nums[i])) continue;
      if (bucket[occurance - 1] == null) bucket[occurance - 1] = new HashSet < Integer > ();
      bucket[occurance - 1].add(nums[i]);
    }
    for (int i = bucket.length - 1; i >= 0; i--) {
      if (bucket[i] != null && bucket[i].size() > 0) output.addAll(bucket[i]);
      if (output.size() == k) break;
    }

    int[] array = new int[output.size()];
    for (int i = 0; i < output.size(); i++) array[i] = output.get(i);
    return array;
  }
}