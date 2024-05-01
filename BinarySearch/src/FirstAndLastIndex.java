public class FirstAndLastIndex {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {2,4,6,8,90,100,100};
        System.out.println(searchRange(arr,100));
    }
    public static int findElement(int[] nums, int target, boolean isFirstIndex){
        int ans=-1, start=0, end=nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=start+1;
            }
            else{
                ans=mid;
                if(isFirstIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findElement(nums,target,true);
        ans[1] = findElement(nums,target,false);
        System.out.println(ans[0]+","+ans[1]);
        return ans;
    }
}
