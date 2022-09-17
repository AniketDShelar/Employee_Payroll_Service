import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    List<Employee> employeeList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void readEmployeeData(){

        System.out.println("Enter ID : ");
        int id = scan.nextInt();
        System.out.println("Enter Name : ");
        String name = scan.next();
        System.out.println("Enter Salary : ");
        double salary = scan.nextDouble();

        Employee employee = new Employee(id,name,salary);
        employeeList.add(employee);
    }
    public void writeData(){
        System.out.println(employeeList);
    }

    @Override
    public String toString() {
        return "EmployeePayrollService{" +
                "employeeList=" + employeeList +
                ", scan=" + scan +
                '}';
    }
}
