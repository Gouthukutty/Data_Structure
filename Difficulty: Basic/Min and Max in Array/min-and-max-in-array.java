class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
       ArrayList<Integer> ans=new ArrayList<>();
       int min=arr[0];
       int max=0;
       for(int i=0;i<=arr.length-1;i++){
          min=min<arr[i]?min:arr[i];
       }
        for(int i=0;i<=arr.length-1;i++){
          max=max>arr[i]?max:arr[i];
       }
     ans.add(min);
     ans.add(max);
     return ans;
    }
}
