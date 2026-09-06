class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        final PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        final Map<Integer, Integer> frequencies = new HashMap<>();
        final int[] res = new int[k];
        for (final int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }
        for (final Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            final int number = entry.getKey();
            final int frequency = entry.getValue();
            final int[] tmp = new int[] {frequency, number};
            minHeap.add(tmp);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        for (int i = 0; i < k; i++) {
            res[i] = minHeap.poll()[1];
        }
        return res;
    }
}
