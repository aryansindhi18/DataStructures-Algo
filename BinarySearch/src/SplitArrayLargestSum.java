public class SplitArrayLargestSum {
    public static void main(String[] args) {

    }

    static int splitArray(int[] arr,int k){
        int start=0,end=0;

        for(int i=0;i<arr.length;i++){
            start = Math.max(start,arr[i]);
            end+=arr[i];
        }
        while(start<end){
            int mid = start+(end-start)/2;
            //calculate how many pieces can you divide this max sum into
            int sum=0;
            int pieces =1;
            for(int num: arr){
                if(sum+num > mid){
                    //cannopt be added in this subarray, make a new one;
                    pieces++;
                    sum=num;
                }
                else{
                    sum+=num;
                }
            }

            if(pieces>k){
                start=mid+1;
            }
            else{
                end=mid;
            }

        }
        return start;
    }
}
