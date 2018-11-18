package employeeProfessionComparator;

import employee.Employee;

import java.util.Comparator;

public class EmployeeProfessionComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2)throws NullPointerException {
        if(e1==null||e2==null){
            throw new NullPointerException("one of objects is NULL");
        }
        return e1.getProfession().compareTo(e2.getProfession());
    }
}