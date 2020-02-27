public class BoundedCounter {
   private int value;
    private int upperLimit;
    public BoundedCounter(int upperLimit){
        this.upperLimit=upperLimit;
        this.value=0;
    }
    public void next(){
     if(this.value+1<=upperLimit){
         this.value++;
     }else {
         this.value=0;
     }
    }
    public int getValue() {
        return this.value;
    }
    public void setValue(int value){
        if(value<=this.upperLimit&&value>=0){
            this.value=value;
        }
    }

    public String toString(){
        String result=this.value<10?"0"+this.value:""+this.value;
        return result;
    }
}
