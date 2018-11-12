package employee;

import java.io.IOException;
import java.math.BigDecimal;

public class Employee {
    private String firstName;
    private String lastName;
    private String profession;
    private BigDecimal salary;
    private String project;

    public Employee(String firstName,String lastName)throws IOException{
        setFirstName(firstName);
        setLastName(lastName);
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
