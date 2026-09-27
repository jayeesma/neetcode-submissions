class Solution {
    public void sortColors(int[] nums) {
        int countZero = 0;
        int countOne=0;
        int countTwo = 0;

        for(int num:nums) {
            if(num==0) {
                countZero++;
            }
            else if(num==1) {
                countOne++;
            }
            else {
                countTwo++;
            }
        }
        System.out.println(countOne+"..."+countTwo);

        int j=0;

        while(j<countZero) {
            nums[j] = 0;
            j++;
            
        }
        System.out.println(countZero + "..."+Arrays.toString(nums));
        int len = countOne+j;
        while(j<len) {
            nums[j] = 1;
            j++;
        }
        System.out.println(Arrays.toString(nums));
        len = countTwo+j;
        while(j<len) {
            nums[j] = 2;
            j++;
        }
        System.out.println(Arrays.toString(nums));
    }
}

