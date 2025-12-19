public class LargestinArray {
    public static void main(String[]args){
        int array[] ={34, 56, 23, 89, 112, 90, 11};
        int largest =array[0];
        for(int num :array){
            if(num >largest){
                largest =num;
            }
        }
        System.out.print(largest);
    }
}
