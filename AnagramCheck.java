import java.util.Arrays;
public class AnagramCheck {
    public static void main(String[]args){
        String str1="Sairam", str2="SAIRAM";
        char[] array1=str1.toCharArray();
        char[] array2=str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.equals(array1,array2));
    }
}
