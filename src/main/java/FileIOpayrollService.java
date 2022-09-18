import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileIOpayrollService implements PayrollService{

    final String FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\employeepayrollservice\\src\\main\\java\\Payroll.txt";
    @Override
    public void writeData(List<Employee> employeeList) {
            StringBuffer employeeBuffer = new StringBuffer();
            employeeList.forEach(empData ->{
            String empString = empData.toString().concat("\n");
            employeeBuffer.append(empString);
        });
        try {
            Files.write(Path.of(FILE_PATH),employeeBuffer.toString().getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void readData() {
        try {
            Files.lines(Path.of(FILE_PATH)).forEach(x -> System.out.println(x));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public long countEntries() {
        try {
            return Files.lines(Path.of(FILE_PATH)).count();
        } catch (IOException e) {
            System.out.println(e);
        }
        return 0;
    }
}
