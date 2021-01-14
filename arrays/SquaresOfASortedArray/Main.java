public class Main {

    public static void main(String[] args) {
        //int[] array = {-5, -4, 0, 3, 5};
        //int[] array = {1, 3, 5};
        int[] array = {-8,-5, -4,  3, 4, 5, 9};
        int[]  result = sortedSquares(array);
        System.out.println("******************");
        for(int i : result) {
            System.out.println(i);
        }
        System.out.println("******************");
    }

    public static int[] sortedSquares(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new int[0];
        } 
        
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int index = endIndex;
        int[] resultArray = new int[nums.length];

        while (startIndex <= endIndex) {
            if(startIndex == endIndex) {
                resultArray[index] = nums[startIndex] * nums[endIndex];
                startIndex++;
                endIndex--;
            } else {
                int startSqrtValue = nums[startIndex] * nums[startIndex];
                int endSqrtValue = nums[endIndex] * nums[endIndex];
                if(endSqrtValue > startSqrtValue) {
                    resultArray[index] = endSqrtValue;
                    endIndex--;
                } else if(endSqrtValue < startSqrtValue) {
                    resultArray[index] = startSqrtValue;
                    startIndex++;
                } else {
                    resultArray[index] = startSqrtValue;
                    resultArray[--index] = endSqrtValue;
                    startIndex++;
                    endIndex--;
                }
            }
            index--;
        }

        return resultArray;     
    }  
}