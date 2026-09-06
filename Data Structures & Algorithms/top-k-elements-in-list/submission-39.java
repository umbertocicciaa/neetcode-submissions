class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        final List<Integer> res = new ArrayList<>();
        // frequence -> numbers
        final Map<Integer, List<Integer>> numbers = new HashMap<>();
        // number -> frequence
        final Map<Integer, Integer> frequencies = new HashMap<>();
        for (final int number : nums) {
            frequencies.put(number, frequencies.getOrDefault(number, 0) + 1);
        }
        for (final Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            final int number = entry.getKey();
            final int frequency = entry.getValue();
            numbers.putIfAbsent(frequency, new ArrayList<>());
            numbers.get(frequency).add(number);
        }
        final int maxFrequent = Collections.max(frequencies.values());
        for (int frequency = maxFrequent; frequency >= 0; frequency--) {
            final List<Integer> numbersWithFreq = numbers.get(frequency);
            if (numbersWithFreq == null) {
                continue;
            }
            for (final int num : numbersWithFreq) {
                res.add(num);
                if (res.size() == k) {
                    return res.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
