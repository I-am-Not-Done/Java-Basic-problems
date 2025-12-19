import java.util.*;

public class MergeArrays {
    public static void main(String[] args) {
        int array1[] = {98, 99, 23, 24, 69, 25};
        int array2[] = {66, 24, 32, 66, 13, 854};
        int[] merged = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, merged, 0, array1.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        System.out.println(Arrays.toString(merged));
    }
}
