public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount>0){
            System.out.print("*");
            amount--;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while (amount>0){
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i=0;
        while(i<size){
            printWhitespaces(size-i-1);
            printStars(i+1);
            i++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int i=0;
        int countOdd=0;
        int numb=0;
        int j=0;
        int count=0;
        while (i<height){
           if(numb%2==1){
               printWhitespaces(height-i-1);
               printStars(numb);
               i++;
           }
           numb++;

        }
      while (count<2){
            printWhitespaces((numb-3)/2);
            printStars(3);
            count++;
      }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
