class Solution {
    public int lengthOfLongestSubstring(String s) {

// Starting with l=0 r=0 window, we will check if if duplicates are there using a set 
// if not there keep adding new characters to the set in that window
// maintain a res and check the max length -> r-l+1
// if duplicate exist, l++, if not r++
        HashSet<Character> set = new HashSet();
        int l=0;
        int r=0;
        int res = 0;
        while(r<s.length()) {
            if(!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                res = Math.max(res,r-l+1);
                r++;
            } else {
                set.remove(s.charAt(l));
                l++;
            }
        }
        return res;
    }
}

// "xxxx"
// l=0;r=0 -> window => "x" 
// 1. set = {'x'}, res = 1, r=1
// 2. set = {}, l=1
// 3. set = {'x'},res=1. r = 2
// 4.  set = {}, l=2
// 5.  set = {'x'},res=1. r = 3



// "zxyzxyz"
// l= 0, r=0 -> window => "z"
// set {z}, r=1
// set {z,x}, r=2
// set {z,x,y},  res = 2-0+1 = 3, r=3
// set{x,y} l=1 
// set{y} l=2
//set {}l=3
// set{z} res =  r=4
// set{z,x} res =4-3+1=2 r =5
// set{z,x,y} res = 5-3+1 = 3, r=6
// set{x,y} l=4
// set{x,y,z} res = 6-4+1 = 3, r=7
    

// s = "pwwkew"
// l=0, r=0
// set = {p}, res = 1, r=1
// set {p,w}, res = 2, r=2
// set {p}, l=1
// set {}

