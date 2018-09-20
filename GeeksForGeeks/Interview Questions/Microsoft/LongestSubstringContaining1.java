class LongestSubstringContaining1 {

    public int count(String s) {
        int maxLen = 0;
        int temp = 0;
 
        for (char c : s.toCharArray()) {
            if (c == '1') {
                temp++;
            }
            else {
                maxLen = Math.max(maxLen, temp);
                temp = 0;
            }
        }       
        
        return Math.max(maxLen, temp);
    }
}
