public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter counter=new Counter(900,false);
        counter.decrease(7);
        System.out.println(counter.value());
    }
}
