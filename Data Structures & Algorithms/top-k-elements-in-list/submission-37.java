class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        final List<Integer> results = new ArrayList<>();
        final Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
        final Map<Integer, List<Integer>> frequencies = new HashMap<Integer, List<Integer>>();
        for (final int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        for (final Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            final int number = entry.getKey();
            final int frequency = entry.getValue();
            frequencies.putIfAbsent(frequency, new ArrayList<>());
            frequencies.get(frequency).add(number);
        }
        final int maxFrequency = Collections.max(frequencies.keySet());
        for (int i = maxFrequency; i >= 0; i--) {
            final List<Integer> values = frequencies.get(i);
            if (values == null) {
                continue;
            }
            for (final int number : values) {
                results.add(number);
                if (results.size() == k) {
                    return results.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }
        return results.stream().mapToInt(Integer::intValue).toArray();
    }
}
