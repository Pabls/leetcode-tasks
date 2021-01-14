public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 11, 123, 11, 11};

        int result = findNumbers(arr);
        System.out.println("result - " + result);
    }

    public static int findNumbers(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        
        int evenNubers = 0;
        for(int number : nums) {
            int length = 0;
            long temp = 1;
            while (temp <= number) {
                length++;
                temp *= 10;
            }

            if(length % 2 == 0) {
                evenNubers++;
            }
        }

        return evenNubers;
    }
}
