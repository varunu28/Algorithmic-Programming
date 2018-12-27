class GfG {
	public int remAnagrams(String s1,String s2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        
        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }
        
        for (char c : s2.toCharArray()) {
            count2[c - 'a']++;
        }
        
        int numOfDeletions = 0;
        
        for (int i=0; i<26; i++) {
            numOfDeletions += Math.abs(count1[i] - count2[i]);
        }
        
        return numOfDeletions;
    }
}
