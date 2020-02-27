import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random randomNumber=new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
      int count=0;
      while (count<7){
          int pickedNumber=randomNumber.nextInt(39)+1;
          if(!containsNumber(pickedNumber)){
              numbers.add(pickedNumber);
              count++;
          }

      }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if(numbers.contains(number)) {
            return true;
        }
        return false;
    }
}
