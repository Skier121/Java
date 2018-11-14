package by.epam.javatraining.baranov.tasks;

import employee.Employee;

import employees.Employees;

public class Main {

    public static void main(String[] args) {
    	Employees companyN=new Employees();
    	Employees newTeam=new Employees();
    	companyN.addEmployee("Rt","Bh","developer",2000.0,"Ff");
    	companyN.printAll();
	}
}
