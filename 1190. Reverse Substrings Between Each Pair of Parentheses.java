/* 1190. Reverse Substrings Between Each Pair of Parentheses */

class Solution {
    public String reverseParentheses(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack(); 

        for (char c : s.toCharArray()){
            if (c == '(' ) {
                stack.push(result.length());
            }
            else if ( c ==')'){
                int start = stack.pop();
                reverse(result, start, result.length() - 1);
            }
            else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private void reverse (StringBuilder result, int start, int end){
        while (start < end){
            char temp = result.charAt(start);
            result.setCharAt(start, result.charAt(end));
            result.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}
