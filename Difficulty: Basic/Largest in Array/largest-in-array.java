class Solution {
    public static int largest(int[] arr) {
        
    int ans=0;    
       for(int i=0;i<=arr.length-1;i++){
           
    ans=ans>arr[i]?ans:arr[i];
       }
        
    return ans;    
    }
}
