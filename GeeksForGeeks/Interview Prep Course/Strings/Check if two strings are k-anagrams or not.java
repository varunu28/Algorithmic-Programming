class GfG {
    boolean areKAnagrams(String s1, String s2, int k) {
        if (s1.length() != s2.length()) {
            return false;
        }
        
        int[] map1 = new int[26];
        int[] map2 = new int[26];
        
        for (char c : s1.toCharArray()) {
            map1[c-'a']++;
        }
        
        for (char c : s2.toCharArray()) {
            map2[c-'a']++;
        }
        
        int count = 0;
        
        for (int i=0; i<26; i++) {
            if (map1[i] > 0 && map1[i] > map2[i]) {
                count += Math.abs(map1[i] - map2[i]);
            }
        }
        
        return count <= k;
    }
}
