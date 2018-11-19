package employeeProfessionComparator;

import employee.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Comparator;

public class EmployeeProfessionComparator implements Comparator<Employee> {
    private static final Logger log= LogManager.getLogger(EmployeeProfessionComparator.class);

    @Override
    public int compare(Employee e1, Employee e2)throws NullPointerException {
        if(e1==null||e2==null){
            log.warn("attempt to compare with NULL. Objects: e1 - "+e1+", e2 - "+e2);
            throw new NullPointerException("one of objects is NULL");
        }
        log.info("comparing e1: "+e1+" and e2: "+e2);
        return e1.getProfession().compareTo(e2.getProfession());
    }
}

