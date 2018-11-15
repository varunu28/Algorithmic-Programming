class ReverseStringUsingStack {
    
    public void reverse(String str){
       Stack<Character> chars = new Stack<>();
       
       for (char c : str.toCharArray()) {
           chars.push(c);
       }
       
       while (!chars.empty()) {
           System.out.print(chars.pop());
       }
       
       System.out.println();
    }
}
