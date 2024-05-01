public class FindInMountainArray {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {2,4,6,8,9,90,89,87,86,7};
//        int[] arr = {2,3};
        int target = 90;
        System.out.println(findInPeak(arr,target));
    }
    public static int findInPeak(int[] arr,int target){
        int peak = findPeak(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if(firstTry!=-1)
            return firstTry;
        return orderAgnosticBS(arr,target,peak+1, arr.length-1);
    }
    public static int orderAgnosticBS(int[] arr,int target,int start, int end){
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target)
                return mid;
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int findPeak(int[] arr){
        int start=0;
        int end = arr.length - 1;


        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]) {
                end=mid;
            }
            else if(arr[mid]<arr[mid+1] ){
                start = mid+1;
            }

        }
        return start;
    }
}
