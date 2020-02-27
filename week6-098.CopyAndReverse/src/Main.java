import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " +Arrays.toString(reverse));
    }
    public static int[] copy(int[] array){

        int[] copyArray=new int[array.length];
        for(int i=0;i<copyArray.length;i++){
            copyArray[i]=array[i];
        }
        return copyArray;

    }
    public static int [] reverseCopy(int [] array){
        int [] reverseArray=new int[array.length];
        for(int i=reverseArray.length-1, j=0;i>=0&&j<array.length;i--,j++){
            reverseArray[j]=array[i];
            System.out.println(reverseArray[i]);
        }
        return reverseArray;
    }
    
}
