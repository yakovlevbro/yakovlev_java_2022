// 1 Rotate Array

class Solution {
    public void rotate(int[] nums, int k) {
        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int newIndex = (i + k) % nums.length;
            newArr[newIndex] = nums[i];
        }

        System.arraycopy(newArr, 0, nums, 0, nums.length);
    }
}
