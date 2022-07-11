// Intersection of Two Arrays II

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
          Map<Integer, Integer> countOfNumbers = new HashMap<>();
        for (int num : nums1) {
            if (countOfNumbers.containsKey(num)) {
                countOfNumbers.put(num, countOfNumbers.get(num) + 1);
            } else {
                countOfNumbers.put(num, 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (countOfNumbers.containsKey(num)) {
                if (countOfNumbers.get(num) > 1) {
                    countOfNumbers.put(num, countOfNumbers.get(num) - 1);
                } else {
                    countOfNumbers.remove(num);
                }
                list.add(num);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }          
        
        return result;
    }
}
