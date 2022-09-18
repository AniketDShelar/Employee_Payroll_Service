import java.util.List;

public interface PayrollService {
    public void writeData(List<Employee> employeeList);
    public void readData();
    public long countEntries();

}
