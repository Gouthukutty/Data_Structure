class Solution {
    public static String reverseString(String s) {
      char [] a=s.toCharArray();
      int i=a.length-1;
      String ans="";
      while(i>=0){
          ans=ans+a[i];
          i--;
      }
    return ans;
    
    }
}