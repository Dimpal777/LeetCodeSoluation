class Solution {
    public int[] searchRange(int[] arr, int target) {
     return  findFirstandLastOccurance(arr,target);
    }
    static int [] findFirstandLastOccurance(int arr[],int target){
       int []ans = new int[2];
       ans[0] =binerySearch(arr,target,true);
       ans[1] =  binerySearch(arr,target,false);
        return ans;
    }
    static int binerySearch(int []arr, int target,boolean isfirstIndex){
        int ans = -1;
     int start = 0;
        int end  = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;//this is for find middle 
            if(target>arr[mid]){
                start = mid+1;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                ans = mid;
                if(isfirstIndex==true){
                     end = mid-1;
                }else{
                    start = mid+1;
                }
                   
                
                
            }
        }
        return ans;
    }
}
