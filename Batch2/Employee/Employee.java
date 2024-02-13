package Batch2;

class Employee {
    private int empId;
    private String empName;
    private double basicPay;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor with object as parameter
    public Employee(Employee emp) {
        this.empId = emp.empId;
        this.empName = emp.empName;
        this.basicPay = emp.basicPay;
    }

    // Function to calculate HRA, DA, and gross
    public CalculationResult calculate() {
        double hra = 0.12 * basicPay;
        double da = 0.03 * basicPay;
        double gross = basicPay + hra + da;
        return new CalculationResult(hra, da, gross);
    }

    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getBasicPay() {
        return basicPay;
    }

    // Setter methods
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }
}
