class Solution {
    
    public static void Reverse(int[] arr, int start , int end ){
       while(start <= end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp; 
           start++;
           end--;
       }
        
}
    public void Rotate(int[] arr, int k ){
        int n = arr.length;
        k = k %n; 
        if( n==1 || k == 0)return ; 
        Reverse(arr, 0 , n-1);
        Reverse(arr, 0, k-1);
        Reverse(arr, k , n-1);
    }
    
}
