package employee;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
    protected String firstName;
    protected String lastName;
    protected String profession;
    protected double salary;
    protected String project;

    //default constructor
    public Employee(){
        this.firstName="";
        this.lastName="";
        this.profession="";
        this.salary=0.0;
        this.project="";
    }

    public Employee(String firstName,String lastName)throws IOException{
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Employee(String firstName,String lastName,String profession,double salary,String project)throws IOException{
        setFirstName(firstName);
        setLastName(lastName);
        this.profession=profession;
        this.salary=salary;
        this.project=project;
    }

    @Override
    public String toString(){
        return ("first name: "+firstName+"\nlast name: "+lastName+"\nprofession: "+profession+"\nsalary: "+salary+
                "\nproject:"+project);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.getSalary(), getSalary()) == 0 &&
                Objects.equals(getFirstName(), employee.getFirstName()) &&
                Objects.equals(getLastName(), employee.getLastName()) &&
                Objects.equals(getProfession(), employee.getProfession()) &&
                Objects.equals(getProject(), employee.getProject());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getFirstName(), getLastName(), getProfession(), getSalary(), getProject());
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws IOException {
        if(salary<=0.0){
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
