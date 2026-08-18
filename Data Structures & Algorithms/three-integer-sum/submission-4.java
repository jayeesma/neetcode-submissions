class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<nums.length-1;i++) {
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            int l = i+1;
            int r = nums.length-1;

            while(l<r) {
                int sum = -nums[i];

                if(nums[l]+nums[r]>sum) {
                    r--;
                } else if(nums[l]+nums[r]<sum){
                    l++;
                } else {
                    list.add(List.of(nums[i], nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l]== nums[l-1]){
                        l++;
                    }
                }
            } 
             
        }
        return list;
    }
    
}



