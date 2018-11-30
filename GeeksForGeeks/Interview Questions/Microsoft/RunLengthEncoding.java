class GfG {
	String encode(String str) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (idx < str.length()) {
            sb.append(str.charAt(idx));
            idx++;
            
            int count = 1;
            
            while (idx < str.length() && str.charAt(idx) == str.charAt(idx - 1)) {
                idx++;
                count++;
            }
            
            sb.append(count);
        }
        
        return sb.toString();
	}
}
