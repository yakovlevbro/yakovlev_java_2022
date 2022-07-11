// Search Insert Position

class Solution {
    public int searchInsert(int[] nums, int target) {
        int leftBorder = 0;
        int rightBorder = nums.length - 1;
        int middlePosition;
        int position = -1;

        while (leftBorder <= rightBorder) {
            middlePosition = leftBorder + (rightBorder - leftBorder) / 2;

            if (nums[middlePosition] == target){
                return middlePosition;
            }

            if (nums[middlePosition] < target) {
                position = middlePosition + 1;
                leftBorder = middlePosition + 1;
            } else {
                position = middlePosition;
                rightBorder = middlePosition - 1;
            }

        }

        return position;
    }
}
