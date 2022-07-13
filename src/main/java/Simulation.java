public class Simulation {
    private int numberOfDice;
    private int timesRolled;
    private int highest;
    private int lowest;
    private Bins bin;
    private Dice dice;

    public static void main(String[] args){
       Simulation sim = new Simulation(2,1000);
       sim.runSimulation();
       sim.printResults();
    }

    public Simulation (int numberOfDice, int timesRolled) {
        this.numberOfDice = numberOfDice;
        this.timesRolled = timesRolled;
        this.highest = 6*numberOfDice;
        this.lowest = numberOfDice;
        this.bin = new Bins(lowest,highest);
        this.dice = new Dice(numberOfDice);

    }

    public void runSimulation () {
        for (int x = 0; x<timesRolled; x++) {
            bin.incrementBins(dice.tossAndSum());
        }
    }
    private void printResults() {
        String star = "";
        int binRoll =0;
        int binNumber =2;
        double percentage = 0.0;
        for (int x =0; x<=(highest-lowest);x++) {
            binRoll = bin.getBinL(x+2);
            percentage = ((double) binRoll/timesRolled);
            for (int y =0; y<Math.round(percentage*100);y++) {
                star+= "*";
            }
            System.out.println(String.format("%3d :  %10d:  %.2f %s", (lowest+x),binRoll, percentage, star));
        }
    }

}
