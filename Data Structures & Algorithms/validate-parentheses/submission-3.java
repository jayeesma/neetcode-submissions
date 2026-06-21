class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Deque<Character> stack = new ArrayDeque();
        // stack -> 
        // [
        // (
        // {

        // ([])




        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == map.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}

// [{()}] -> true

// stack.push ->

// HashMap ->
// ) -> (
// } -> {
// ] -> [

// if map.containsKey(stack.peek())

// ]. map=> [
