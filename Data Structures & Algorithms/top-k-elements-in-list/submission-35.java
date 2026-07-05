class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null) {
            return new int[] {};
        }
        final List<Integer> res = new ArrayList<>();
        final Map<Integer, Integer> counter = new HashMap<>();
        final Map<Integer, List<Integer>> frequency = new HashMap<>();
        for (final int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        for (final Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            final int num = entry.getKey();
            final int freq = entry.getValue();
            frequency.putIfAbsent(freq, new ArrayList<>());
            frequency.get(freq).add(num);
        }
        final int max_frequency = Collections.max(frequency.keySet());
        for (int i = max_frequency; i > 0; i--) {
            final List<Integer> numbers = frequency.get(i);
            if (numbers == null) {
                continue;
            }
            for (final int num : numbers) {
                res.add(num);
                if (res.size() == k) {
                    return res.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
