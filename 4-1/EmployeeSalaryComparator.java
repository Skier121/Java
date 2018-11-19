package employeeSalaryComparator;

import employee.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;


public class EmployeeSalaryComparator implements Comparator<Employee> {
    private static final Logger log=LogManager.getLogger(EmployeeSalaryComparator.class);

    @Override
    public int compare(Employee e1,Employee e2){
        if(e1==null||e2==null){
            log.warn("attempt to compare NULL object. e1 - "+e1+", e2 - "+e2);
            throw new NullPointerException("one of objects is NULL");
        }
        Double s1=e1.getSalary();
        Double s2=e2.getSalary();
        log.info("attempt to compare by salary. e1 - "+e1+", e2 - "+e2);
        if (e1.getSalary()==(e2.getSalary())) {
            return 0;
        }
        if ((e1.getSalary() > (e2.getSalary()))) {
            return 1;
        }
        else{
            return -1;
        }
    }
}
