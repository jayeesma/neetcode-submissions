class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j=numbers.length-1;
        int i=0;
        while(i<=j) {
            if(numbers[i]+numbers[j]==target) {
                return new int[]{i+1,j+1};
            }
            if(numbers[i]+numbers[j]<target) {
                i++;
            } else if(numbers[i]+numbers[j]>target) {
                j--;
            }
        }
        return new int[] {};
    }
}
