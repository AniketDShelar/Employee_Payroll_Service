import java.util.List;

public class EmployeePayrollService {

    public enum IOService{
        CONSOLE_IO, FILE_IO
    }

    private final List<Employee> employeePayrollList;

    public EmployeePayrollService(List<Employee> list) {
        this.employeePayrollList = list;
    }
    public PayrollService getPayrollServiceObject(IOService ioType){
        PayrollService payrollService = null;
        if(IOService.FILE_IO.equals(ioType)){
            payrollService = new FileIOpayrollService();
        }
        return payrollService;
    }
    public void writeData(IOService ioType) {
        PayrollService payrollService = getPayrollServiceObject(ioType);
        payrollService.writeData(employeePayrollList);
    }

    public void readData(IOService ioType) {
        PayrollService payrollService = getPayrollServiceObject(ioType);
        payrollService.readData();
    }

    public long countEntries(IOService ioType) {
        PayrollService payrollService = getPayrollServiceObject(ioType);
        return payrollService.countEntries();
    }
}
