package employee;

import java.io.IOException;
import java.math.BigDecimal;

public class Employee {
    protected String firstName;
    protected String lastName;
    protected String profession;
    protected BigDecimal salary;
    protected String project;

    public Employee(String firstName,String lastName)throws IOException{
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Employee(){
        this.firstName="";
        this.lastName="";
        this.profession="";
        this.salary=new BigDecimal(0);
        this.project="";
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
            throw new IOException("wrong profession length");
        }
        else{
            this.profession=profession;
        }
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) throws IOException {
        if(salary.doubleValue()<=0){
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
            throw new IOException("enter project name");
        }
        else{

        }
    }
}
