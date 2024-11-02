class Solution {
    public String reverseWords(String s) {
       

        if (s == null || s.length() == 0) {
            return "";
        }
        
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();
       
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                reversed.append(words[i]).append(" ");
            }
        }
       
        return reversed.toString().trim();
    

   


    }
}
