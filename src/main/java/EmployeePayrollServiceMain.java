public class EmployeePayrollServiceMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Payroll Service Program");
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        employeePayrollService.readEmployeeData();
        employeePayrollService.writeData();
    }
}
