class Solution {
    public int hIndex(int[] citations) {
        
        int len = citations.length;
 
        int[] papers_freq = new int[len+1];
        for(int c: citations) {
            if(c > len) {
                papers_freq[len]++;
            } else {
                papers_freq[c]++;
            }
        }
        int totalCitations = 0;
        for(int i = len; i >= 0; i--) {
            totalCitations += papers_freq[i];
            if(totalCitations >= i) {
                return i;
            }   
        }
        return -1;
    }
}
