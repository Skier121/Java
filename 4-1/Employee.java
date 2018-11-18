package employee;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;

public class Employee {
    private final static Logger log= LogManager.getLogger(Employee.class);
    protected String firstName;
    protected String lastName;
    protected String profession;
    protected double salary;
    protected String project;

    //default constructor
    public Employee(){
        log.info("empty Employee creation");
        this.firstName="";
        this.lastName="";
        this.profession="";
        this.salary=0.0;
        this.project="";
    }


    public Employee(String firstName,String lastName,String profession,double salary,String project)throws IOException{
        setFirstName(firstName);
        setLastName(lastName);
        setProfession(profession);
        setSalary(salary);
        setProject(project);
    }

    @Override
    public String toString(){
        return ("first name: "+firstName+"\nlast name: "+lastName+"\nprofession: "+profession+"\nsalary: "+salary+
                "\nproject:"+project);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws IOException {
        if(firstName.length()==0){
            throw new IOException("wrong name length");
        }
        else{
            this.firstName=firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName)throws IOException {
        if(lastName.length()==0){
            log.warn("attempt to add emty name");
            throw new IOException("wrong name length");
        }
        else{
            this.lastName=lastName;
        }
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession)throws IOException {
        if(profession.length()==0){
            log.warn("attempt to add empty profession");
            throw new IOException("wrong profession length");
        }
        else{
            this.profession=profession;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws IOException {
        if(salary<=0.0){
            log.warn("attempt to add salary: "+salary);
            throw new IOException("wrong salary value");
        }
        else {
            this.salary = salary;
        }
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) throws IOException {
        if(project.length()==0){
            log.warn("attempt to add empty project");
            throw new IOException("enter project name");
        }
        else{

        }
    }
}