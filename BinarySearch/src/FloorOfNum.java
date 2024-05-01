public class FloorOfNum {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {2,4,6,8,90,100};
        System.out.println(floorOffNum(arr,99));
    }
    static int floorOffNum(int[] nums,int target){
        int start = 0, end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return end;
    }

}
