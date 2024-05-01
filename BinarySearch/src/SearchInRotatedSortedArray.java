public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {2,2,2,9,2};
//        int[] arr = {2,3};
        int target = 2;
        System.out.println(search(arr,target));
    }
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        System.out.println("pivot: "+pivot);
        if(pivot==-1)
            return binarySearch(nums,target,0,nums.length-1);
        if(nums[pivot]==target)
            return pivot;
        if(target>=nums[0])
            return binarySearch(nums,target,0,pivot-1);
        return binarySearch(nums,target,pivot+1,nums.length-1);

    }

    static int findPivot(int[] nums){
        int start=0, end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            //4 cases
            if(mid<end && nums[mid]>nums[mid+1])
                return mid;
            else if(mid>start && nums[mid]<nums[mid-1])
                return mid-1;
            else if(nums[start] >= nums[mid])
                end = mid-1;
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target)
                return mid;
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
