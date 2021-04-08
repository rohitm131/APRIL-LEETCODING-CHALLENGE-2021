class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = new String[] {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        LinkedList<String> oparr = new LinkedList<>();
        if(digits.length() == 0) return oparr;
        
        oparr.add("");
        
        for(int i=0; i<digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            while(oparr.peek().length() == i) {
                String p = oparr.remove();
                for(char c : map[index].toCharArray()) {
                    oparr.add(p + c);
                }
            }
        }
        return oparr;
    }
}
