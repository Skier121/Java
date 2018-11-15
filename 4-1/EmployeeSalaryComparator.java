package employeeSalaryComparator;

import employee.Employee;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1,Employee e2){
        if(e1==null||e2==null){
            throw new NullPointerException("one of objects is NULL");
        }
        Double s1=e1.getSalary();
        Double s2=e2.getSalary();
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
