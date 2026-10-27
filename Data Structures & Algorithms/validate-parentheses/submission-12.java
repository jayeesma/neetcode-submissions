class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        HashMap<Character,Character> map = new HashMap<>();

        Stack<Character> stack = new Stack();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        int n = s.length();
        for(int i=0;i<n;i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)== '{') {
                stack.push(s.charAt(i));
            } else {
                if(!stack.isEmpty() && stack.peek()==map.get(s.charAt(i))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


