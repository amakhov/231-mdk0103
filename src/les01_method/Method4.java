package les01_method;

public class Method4 {
    public static void main(String[] args) {
        int[] array1 = {123, 7, -4, 98, 75, 44};
        int[] array2 = {64, 2, -4, 398, 765, -59, 535};
        int[] array3 = {-64, 32, -44, 3948, 7265, -549, 535, 5535};
        printArray(array1);
        printArray(array2);
        printArray(array3);
        int max = getMaxArr(array2);
        System.out.println(max);
    }

    public static int getMinArr(int[] arr) {
            int min = 0;
            for(int i: arr){
                if (i < min) {
                    min = i;
                }
            }
            return min;
    }

    public static int getMaxArr(int[] arr) {
        int max = 0;
        for (int i: arr) {
            if( i > max) {
                max = i;

            }
        }
        return max;
    }

    public static void printArray(int[] ar) {
        for(int i: ar) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
