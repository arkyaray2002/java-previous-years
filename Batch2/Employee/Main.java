package Batch2;

public class Main {
    public static void main(String[] args) {
        // Create employees
        Employee emp1 = new Employee();
        emp1.setEmpId(1);
        emp1.setEmpName("John");
        emp1.setBasicPay(40000);

        Employee emp2 = new Employee();
        emp2.setEmpId(2);
        emp2.setEmpName("Alice");
        emp2.setBasicPay(60000);

        // Calculate and display details of employees with gross more than 50,000
        displayEmployeesWithGrossMoreThan50000(emp1);
        displayEmployeesWithGrossMoreThan50000(emp2);
    }

    public static void displayEmployeesWithGrossMoreThan50000(Employee emp) {
        CalculationResult result = emp.calculate();
        if (result.getGross() > 50000) {
            System.out.println("Employee ID: " + emp.getEmpId());
            System.out.println("Employee Name: " + emp.getEmpName());
            System.out.println("Basic Pay: " + emp.getBasicPay());
            System.out.println("HRA: " + result.getHra());
            System.out.println("DA: " + result.getDa());
            System.out.println("Gross: " + result.getGross());
            System.out.println();
        }
    }
}
