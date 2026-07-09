class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for(int i =0; i<nums.length;i++) {
            if(i>maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }
}



// 0->1 => 1

// 1->3 => 2

// 3->4 => 1


// 0->1 => 1
// 1->3 => 2

// [2,5,0,0]

// [2,]




