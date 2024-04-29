import static java.util.Arrays.binarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {2,4,6,8,90,100};
        int[] arr = {100,90,8,6,4,2};
        System.out.println(orderAgnosticBS(arr,100));


        int[] a = {1,2,3};
        int[] b = {1,2,3};
        int[] c = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a==b);
        System.out.println(a==c);

        a[2] = 5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        String s = "Aryan";
        String s1 = "Aryan";
        System.out.println(s==s1);



    }
    static int orderAgnosticBS(int[] arr,int target){
        int start=0;
        int end = arr.length - 1;
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
}
