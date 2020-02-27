public class Birds {
    private String name;
    private String latinName;
    private int observation;

    public String getName() {
        return name;
    }

    public Birds(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservation() {
        return observation;
    }
    public void incrementObservation(Birds bird){
        observation++;
    }
    public String toString(){
        return name+"("+latinName+"): "+observation+" observations";
    }
}
