import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here

        int[] values = {3, 2, 5, 4, 8};

        System.out.println( Arrays.toString(values) );

        swap(values, 1, 0);
        System.out.println( Arrays.toString(values) );

        swap(values, 0, 3);
        System.out.println( Arrays.toString(values) );
    }
    public  static int smallest(int [] array){
        int smallestNumber=array[0];
        for(int i=0;i<array.length;i++){
            if(smallestNumber>array[i]){
                smallestNumber=array[i];
            }
        }
        return  smallestNumber;
    }
    public static int indexOfTheSmallest(int [] array){
        int smallestNumberIndex=0;
        int smallestNumber=array[smallestNumberIndex];
        for(int i=0;i<array.length;i++){
            if(smallestNumber>array[i]){
                smallestNumber=array[i];
                smallestNumberIndex=i;
            }
        }

        return smallestNumberIndex;
    }
    public static int indexOfTheSmallestStartingFrom(int [] array,int startIndex){

        int smallestNumber=array[startIndex];
        int indexOfTheSmallest=startIndex;
        for(int i=startIndex;i<array.length;i++){
            if(smallestNumber>array[i]){
                smallestNumber=array[i];
                indexOfTheSmallest=i;
            }

        }
        return indexOfTheSmallest;
    }
    public static void swap(int [] array,int firstIndex,int secondIndex){
        int temp=array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;

    }
    public static void sort(int[] array) {
        for (int count = 0; count < array.length; count++) {
            int index = indexOfTheSmallestStartingFrom(array, count);
            swap(array, count, index);

        }
    }

}
