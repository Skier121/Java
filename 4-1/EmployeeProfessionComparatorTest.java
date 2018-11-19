package employeeProfessionComparator;

import employee.Employee;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class EmployeeProfessionComparatorTest {

    @Test
    public void compare()throws IOException {
        Employee e1=new Employee("Rt","Bh","developer",2000.0,"Ff");
        Employee e2=new Employee("Rt1","Ba","developer",2000.0,"Ff");
        EmployeeProfessionComparator epc=new EmployeeProfessionComparator();
        assertEquals(0,epc.compare(e1,e2));
    }
}