package exam.Grade10;

public class Result {
    private int sum;
    private double avg;

    @Override
    public String toString() {
        return "sum = " + sum + ", avg = " + avg;
    }
    public void setAvg(double number) {
        this.avg = sum/number;
    }
    public void plusSum(int sum) {
        this.sum += sum;
    }
}
