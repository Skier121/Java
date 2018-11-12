package employees;
import employee.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.util.ArrayList;

public class Employees {

    private final static Logger log=LogManager.getLogger(Employees.class);

    private ArrayList<Employee>employees=new ArrayList<>();

    public Employee findEmployee(String fName,String lName){
        log.info("try to find Employee: "+fName+", "+lName+")");
        for(Employee emp:employees){
            if((emp.getFirstName().equals(fName))&(emp.getLastName().equals(lName))){
                return emp;
            }
        }
        return new Employee();
    }

    public int addEmployee(String firstName,String lastName){
        try {
            employees.add(new Employee(firstName, lastName));
            return 1;
        }catch(IOException e){
            log.warn(e.getMessage());
        }
        return -1;
    }

    public void delete(String fName,String lName){
        employees.remove(findEmployee(fName,lName));
    }
}
