class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int r=0;
        for(int x:nums){
            int count=h.getOrDefault(x,0);
            count++;
            h.put(x,count);
        }
        for(int x:h.keySet()){
            if(h.get(x)>nums.length/2){
                return x;
            }
        }
        return -1;
    }
}