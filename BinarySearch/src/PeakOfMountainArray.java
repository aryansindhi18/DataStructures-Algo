public class PeakOfMountainArray {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        int[] arr = {2,4,6,8,9,90,89,87,86,7};
        int[] arr = {2,3};
        System.out.println(findPeak(arr));
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
