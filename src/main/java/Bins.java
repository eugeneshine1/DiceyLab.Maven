
public class Bins {
    private int binL;
    private int [] bin;

    public Bins (int lower, int upper) {
        this.bin= new int[upper -lower+1];
        this.binL= lower;
    }

    public void incrementBins (int binNumber) {
        bin [binNumber -binL]++;
    }

    public int getBinL(int binNumber) {
        return bin [binNumber -binL];
    }
}
