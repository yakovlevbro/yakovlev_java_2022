// Permutations

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        calculate(nums, list, 0);
        return list;
    }
    
    public void calculate(int[] nums, List<List<Integer>> list, int index) {
        if (nums.length == index) {
            List<Integer> list1 = new ArrayList<>();

            for (int num : nums) {
                list1.add(num);
            }

            list.add(list1);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;

            calculate(nums, list, index + 1);

            temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
    }
}
