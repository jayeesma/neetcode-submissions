class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++) {

            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            } 
        
            int l = i+1;
            int r= nums.length - 1 ;
            int sum = -nums[i];

            while(l<r) {
                if(nums[l]+nums[r]<sum) {
                    l++;
                } else if(nums[l]+nums[r]>sum) {
                    r--;
                } else {
                    list.add(List.of(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l-1]==nums[l]){
                        l++;
                    }
                    
                }
            }
        }
        return list;
    }
}
// 1

// -1,0,1,2,-1,-4


// -4, -2,-1, -1, 0