public class SearchInArray {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] numbs = {23,5,6,7,9};
        int target=199;
        System.out.println(linearSearch(numbs,
                target));
    }

    static int linearSearch(int[] arr,int target){
        if(arr.length == 0)
            return -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
    static int linearSearch2(int[] arr,int target){
        if(arr.length == 0)
            return -1;
        for(int ele: arr){
            if(ele==target) {
                return ele;
            }
        }
        return Integer.MIN_VALUE;
    }
}