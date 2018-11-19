package employees;
import employee.Employee;
import employeeProfessionComparator.EmployeeProfessionComparator;
import employeeSalaryComparator.EmployeeSalaryComparator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.util.*;


public class Employees {

    private final static Logger log=LogManager.getLogger(Employees.class);
    Comparator<Employee>ecomp=new EmployeeProfessionComparator().thenComparing(new EmployeeSalaryComparator());
    private ArrayList<Employee> employees=new ArrayList();

    //fill up the team from file
    public int filFromFile(File path){
        log.info("attempt to read team from file: "+path);
        try{
            BufferedReader br=new BufferedReader(new FileReader(path));
            String line=br.readLine();
            while(line!=null){
                String[]temp=line.split(",");
                addEmployee(temp[0],temp[1],temp[2],Double.parseDouble(temp[3]),temp[4]);
                line=br.readLine();
            }
        }catch(FileNotFoundException e){
            log.warn("unsuccesfull attemp to read file from: "+path);
        }catch(IOException e){
            log.warn("IOException. while reading: "+path);
        }catch(NumberFormatException e){
            log.warn("attempt to input uncorrect number");
        }
        return 1;
    }

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
        log.info("attempt to calculate 1-hour teamwork cost");
        double cost=0;
        for (Employee emp:this.employees) {
            cost+=emp.getSalary();
        }
        return cost/160;
    }

    //sort
    public void sort()throws NullPointerException{
        if(employees.equals(null)){
            log.warn("attempt to sort empty list of Employees");
            throw new NullPointerException("list of employees is empty");
        }else{
            employees.sort(ecomp);
        }
    }

    //add new employee
    public int addEmployee(String firstName,String lastName,String profession,double salary,String project){
        log.info("attempt to add new imloyee: first name - "+firstName+", last name - "+lastName+", profession - "+
                profession+"' salary - "+salary+", project - "+project+".");
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
        log.info("attempt to add Employee: "+e);
        if(e.equals(null)){
            return -1;
        }
        this.employees.add(e);
        return 1;
    }

    //prints Employee object to console
    public void print(Employee emp){
        log.info("printing out to console Employees info: "+emp);
        System.out.println(emp.toString());
    }

    //prints all Employee objects in group
    public void printAll(){
        log.info("printing out to console group of Employee objects ");
        for(Employee emp:employees){
            System.out.println(emp.toString());
            System.out.println("\n");
        }
    }

    //delete of Employee object be first name + last name
    public void delete(String fName,String lName){
        log.info("attept to delete Employee : first name - "+fName+", last name - "+lName);
        employees.remove(findEmployee(fName,lName));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees1 = (Employees) o;
        return Objects.equals(employees, employees1.employees);
    }

    @Override
    public int hashCode() {

        return Objects.hash(employees);
    }
}
