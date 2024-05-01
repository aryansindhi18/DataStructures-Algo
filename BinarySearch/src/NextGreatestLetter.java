public class NextGreatestLetter {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        char[] arr = {'c','d','f','g'};
        System.out.println(nextGreatestLetter(arr,'e'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            // if(letters[mid]==target){
            //     return letters[(mid+1)%letters.length];
            // }
            // else
            if(target<letters[mid]){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start<letters.length ? letters[start] : letters[0];
    }
}
