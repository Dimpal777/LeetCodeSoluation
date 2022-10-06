class Solution {
    public int[] searchRange(int[] arr, int target) {
     int []ans = new int[2];
        ans[0]=-1;
        ans[1]=-1;
            
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                ans[0]=i;
                break;
            }
              
           
    }
         for(int i=arr.length-1; i>=0; i--){
            if(arr[i]==target){
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}