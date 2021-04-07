class Solution {
    public boolean halvesAreAlike(String s) {
        
        int n = s.length();
        String first = s.substring(0, n/2);
        first = first.toLowerCase();
        String second = s.substring(n/2, n);
        second = second.toLowerCase();
        
        int cnt = 0;
        
        for(char c : first.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') cnt++;
        }
        
        for(char c : second.toCharArray()) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') cnt--;
        }
        
        if(cnt == 0) return true;
        return false;
        
    }
}
