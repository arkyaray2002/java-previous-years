package Batch2;

class CalculationResult {
    private double hra;
    private double da;
    private double gross;

    public CalculationResult(double hra, double da, double gross) {
        this.hra = hra;
        this.da = da;
        this.gross = gross;
    }

    public double getHra() {
        return hra;
    }

    public double getDa() {
        return da;
    }

    public double getGross() {
        return gross;
    }
}
