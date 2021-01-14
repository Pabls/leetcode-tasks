public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {1,0,2,3,0,4,5,0};
        //int[] arr = new int[] {0,0,0,3,0,4,5,0};
       //int[] arr = new int[] {1,0,2,3,0,4,5,0};
       //int[] arr = new int[] {1,2,3};
       //int[] arr = new int[] {0};
       duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        if(arr == null || arr.length < 2) {
            return;
        }

        int[] newArray = new int[arr.length];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(index < arr.length) {
                int value = arr[i];
                if(value == 0) {
                    newArray[index] = value;
                    if(index < arr.length - 1)
                        newArray[++index] = value;
                } else {
                    newArray[index] = value;
                }
                index++;
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = newArray[i];
        }
    }
}
