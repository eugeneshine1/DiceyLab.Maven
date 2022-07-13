public class Dice {

    private int numberOfDies;
    public Dice (int numberOfDies){
        this.numberOfDies=numberOfDies;
    }
    public int tossAndSum(){
        int sum =0;
        for (int x=0;x<numberOfDies;x++){
            sum += Math.floor(Math.random()*6+1);
        }
        return sum;
    }

}
