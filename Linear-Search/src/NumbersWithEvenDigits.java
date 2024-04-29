public class NumbersWithEvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

        char[] letters = {'a', 'b'};
        System.out.println(letters[0]>letters[1]);
    }

    public static int NumberOfDigits(int num){
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }
    public static int findNumbers(int[] nums) {
        int ans = 0;
        for (int x : nums) {
            if (NumberOfDigits(x) % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}
