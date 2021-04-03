class Solution {
    public int longestValidParentheses(String s) {
        
        if(s == null || s.length() < 2) {
            return 0;
        }
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push(i);
            } else{

                // current closing bracket

                if(!st.empty() && s.charAt(st.peek()) == '('){
                    // balanced case
                    st.pop();
                } else {
                    // unbalanced case
                    st.push(i);
                }
            }
        }

        
        int max = 0;
        int end = s.length();
        
        while(!st.isEmpty()) {
            int start = st.pop();
            max = Math.max(max, end-start-1);
            end = start;
        }
        
        return Math.max(end, max);
    }
}
