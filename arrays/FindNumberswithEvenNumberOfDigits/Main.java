public class Main {

    public static void main(String[] args) {
        
        int resultWithNull = findMaxConsecutiveOnes(null);
        System.out.println("resultWithNull " + resultWithNull);

        int[] emptyArray = new int[5];
        int resultWithEmptyArr = findMaxConsecutiveOnes(emptyArray);
        System.out.println("resultWithEmptyArr " + resultWithEmptyArr);

        int[] arr = {0, 0, 1,  1, 0, 1, 1, 1, 0, 1,1, 0, 1, 1, 0};
        int result = findMaxConsecutiveOnes(arr);
        System.out.println("result " + result);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int maxConsecutiveOnesValue = 0;
        int lastMaxConsecutiveOnesValue = 0;
            
        for(int val : nums) {
                if(val == 1) {
                lastMaxConsecutiveOnesValue++;
                if(maxConsecutiveOnesValue < lastMaxConsecutiveOnesValue) {
                    maxConsecutiveOnesValue = lastMaxConsecutiveOnesValue;
                }
            } else {
                lastMaxConsecutiveOnesValue = 0;
            }
        }
            
        return maxConsecutiveOnesValue;
    }
}
