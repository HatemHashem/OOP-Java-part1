public class Reformatory {
    private int numberOfTimes;

    public int weight(Person person) {
        // return the weight of the person
        this.numberOfTimes+=1;
        return person.getWeight();
    }
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }
    public int totalWeightsMeasured(){
        return this.numberOfTimes;
    }

}
