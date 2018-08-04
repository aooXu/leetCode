package xu.leedcode.aug.n04;

public class Question326 {
    public  boolean isPowerOfThree(int n) {
        double tem = Math.log10(n) / Math.log10(3);
        return (tem - (int) (tem)) == 0;
    }
}
