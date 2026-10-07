class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int k = 0;
        for (int x : nums) {
            int count = h.getOrDefault(x, 0);

            count++;
            if (count <3) {
                h.put(x, count);
                nums[k] = x;
                k++;

            }
        }
        return k;
    }
}