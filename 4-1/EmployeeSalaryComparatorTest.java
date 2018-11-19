package employeeSalaryComparator;

import employee.Employee;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class EmployeeSalaryComparatorTest {

    @Test
    public void compare()throws IOException {
        EmployeeSalaryComparator esc=new EmployeeSalaryComparator();
        Employee e1=new Employee("Rt","Bh","developer",2000.0,"Ff");
        Employee e2=new Employee("Rt1","Ba","developer",2100.0,"Ff");
        assertEquals(-1,esc.compare(e1,e2));
    }
}