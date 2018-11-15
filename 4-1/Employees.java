package employees;
import employee.Employee;
import employeeProfessionComparator.EmployeeProfessionComparator;
import employeeSalaryComparator.EmployeeSalaryComparator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;


public class Employees {

    private final static Logger log=LogManager.getLogger(Employees.class);

    Comparator<Employee>ecomp=new EmployeeProfessionComparator().thenComparing(new EmployeeSalaryComparator());
    private ArrayList<Employee> employees=new ArrayList();

    //search of employee by name
    public Employee findEmployee(String fName,String lName){
        log.info("try to find Employee: "+fName+", "+lName+")");
        for(Employee emp:employees){
            if((emp.getFirstName().equals(fName))&(emp.getLastName().equals(lName))){
                return emp;
            }
        }
        return new Employee();
    }

    //search of employee by salary
    public Employee findEmployee(String profession,double low,double high){
        log.info("try to find Employee by salary: "+low+", "+high+")");
        for(Employee emp:employees){
            if(emp.getProfession().equalsIgnoreCase(profession)) {
                if ((emp.getSalary() >= low) & (emp.getSalary() <= high)) {
                    return emp;
                }
            }
        }
        return new Employee();
    }

    //calculate team cost
    public double calcTeamCost(){
        double cost=0;
        for (Employee emp:this.employees) {
            cost+=emp.getSalary();
        }
        return cost/260/8;
    }

    //sort
    public void sort()throws NullPointerException{
        if(employees.equals(null)){
            throw new NullPointerException("list of employees is empty");
        }else{
            employees.sort(ecomp);
        }
    }

    public int addEmployee(String firstName,String lastName,String profession,double salary,String project){
        try {
            employees.add(new Employee(firstName,lastName,profession,salary,project));
            return 1;
        }catch(IOException e){
            log.warn(e.getMessage());
        }
        return -1;
    }

    //add employee by object
    public int addEmployee(Employee e){
        if(e.equals(null)){
            return -1;
        }
        this.employees.add(e);
        return 1;
    }
    //prints Employee object to console
    public void print(Employee emp){
        System.out.println(emp.toString());
    }

    //prints all Employee objects in group
    public void printAll(){
        for(Employee emp:employees){
            System.out.println(emp.toString());
            System.out.println("\n");
        }
    }

    public void delete(String fName,String lName){
        employees.remove(findEmployee(fName,lName));
    }


}
