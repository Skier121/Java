package manager;

import employee.Employee;

import java.io.IOException;

public class Manager extends Employee {
    protected String manage;

    public Manager(String firstName,String lastName,String profession,double salary,String project,String manage)
            throws IOException {
        super(firstName,lastName,profession,salary,project);
        this.manage=manage;
    }

    public void manage(String command){
        System.out.println(command);
    }
}
