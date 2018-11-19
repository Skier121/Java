package by.epam.javatraining.baranov.tasks;

import employee.Employee;

import employees.Employees;

public class Main {

    public static void main(String[] args) {
    	Employees companyN=new Employees();
    	Employees newTeam=new Employees();
    	companyN.addEmployee("Rt","Bh","developer",2000.0,"Ff");
		companyN.addEmployee("Rt1","Bh1","developer",3000.0,"Ff");
		companyN.addEmployee("Rt2","Bh2","developer",2500.0,"Ff");
		companyN.addEmployee("Rt3","Bh3","developer",4000.0,"Ff");
		companyN.addEmployee("Rt4","Bh4","developer",6000.0,"Ff");
		companyN.addEmployee("Rt5","Bh5","developer",2100.0,"Ff");
    	companyN.printAll();
    	newTeam.addEmployee(companyN.findEmployee("developer",1900.0,2000.0));
    	newTeam.printAll();
		System.out.println(newTeam.calcTeamCost());
		companyN.sort();
		companyN.printAll();
	}
}
