class Solution {
    public int longestConsecutive(int[] nums) {
    TreeSet<Integer> set = new TreeSet<>();

    for (int num : nums) {
        set.add(num);
    }

    int max = 0;
    int streak = 0;
    int prev = Integer.MIN_VALUE;

    for (int current : set) {
        if (current == prev + 1) {
            streak++;
        } else {
            streak = 1;
        }

        max = Math.max(max, streak);
        prev = current;
    }

    return max;
}

}
