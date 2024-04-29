public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {2,4,6,8,90,100};
        System.out.println(binarySearch(arr,100));
    }

    static int binarySearch(int[] arr,int target){
        int start=0;
        int end = arr.length - 1;


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