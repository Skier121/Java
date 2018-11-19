package employees;

import employee.Employee;
import employeeProfessionComparator.EmployeeProfessionComparator;
import employeeSalaryComparator.EmployeeSalaryComparator;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.*;

public class EmployeesTest {
    EmployeeSalaryComparator esc=new EmployeeSalaryComparator();
    EmployeeProfessionComparator epc=new EmployeeProfessionComparator();
    Employees companyN=new Employees();
    Employees companyM=new Employees();
    Employee e1=new Employee("Rt","Bh","developer",2000.0,"Ff");

    public EmployeesTest() throws IOException {
    }

    @Test
    public void filFromFile() {
        Employees companyN=new Employees();
        Employees companyM=new Employees();
        companyM.filFromFile(new File("D:\\work\\GitHub\\Java\\4-1\\data.txt"));
        companyN.addEmployee("Rt","Bh","developer",2000.0,"Ff");
        companyN.addEmployee("Rt1","Bh1","developer",3000.0,"Ff");
        companyN.addEmployee("Rt2","Bh2","developer",2500.0,"Ff");
        companyN.addEmployee("Rt3","Bh3","developer",4000.0,"Ff");
        companyN.addEmployee("Rt4","Bh4","developer",6000.0,"Ff");
        companyN.addEmployee("Rt5","Bh5","developer",2100.0,"Ff");
        Assert.assertEquals(companyN.hashCode(),companyM.hashCode());
    }

    @Test
    public void findEmployee()throws IOException {
        companyM.filFromFile(new File("D:\\work\\GitHub\\Java\\4-1\\data.txt"));
        Employee e1=new Employee("Rt","Bh","developer",2000.0,"Ff");
        Employee e2=companyM.findEmployee("Rt","Bh");
        Assert.assertEquals(e1.hashCode(),e2.hashCode());
    }

    @Test
    public void findEmployee1()throws IOException {
        companyM.filFromFile(new File("D:\\work\\GitHub\\Java\\4-1\\data.txt"));
        Employee e1=new Employee("Rt","Bh","developer",2000.0,"Ff");
        Employee e2=companyM.findEmployee("developer",1999.0,2001.0);
        Assert.assertEquals(e1.hashCode(),e2.hashCode());
    }

    @Test
    public void calcTeamCost() {
        companyM.filFromFile(new File("D:\\work\\GitHub\\Java\\4-1\\data.txt"));
        Assert.assertEquals(122.5,companyM.calcTeamCost());
    }

    @Test
    public void sort() {
        Employees companyN=new Employees();
        Employees companyM=new Employees();
        companyM.filFromFile(new File("D:\\work\\GitHub\\Java\\4-1\\data.txt"));
        companyN.addEmployee("Rt","Bh","developer",2000.0,"Ff");
        companyN.addEmployee("Rt5","Bh5","developer",2100.0,"Ff");
        companyN.addEmployee("Rt2","Bh2","developer",2500.0,"Ff");
        companyN.addEmployee("Rt1","Bh1","developer",3000.0,"Ff");
        companyN.addEmployee("Rt3","Bh3","developer",4000.0,"Ff");
        companyN.addEmployee("Rt4","Bh4","developer",6000.0,"Ff");
        companyM.sort();
        assertEquals(companyM,companyN);

    }

    @Test
    public void addEmployee() {
        assertEquals(1,companyN.addEmployee("Rt","Bh","developer",2000.0,"Ff"));
    }

    @Test
    public void addEmployee1() {
        companyM.filFromFile(new File("D:\\work\\GitHub\\Java\\4-1\\data.txt"));
        assertEquals(1,companyN.addEmployee(companyM.findEmployee("Rt","Bh")));
    }


    @Test
    public void delete() {
        Employees companyN=new Employees();
        Employees companyM=new Employees();
        companyM.filFromFile(new File("D:\\work\\GitHub\\Java\\4-1\\data.txt"));
        companyN.addEmployee("Rt","Bh","developer",2000.0,"Ff");
        companyN.addEmployee("Rt5","Bh5","developer",2100.0,"Ff");
        companyN.addEmployee("Rt2","Bh2","developer",2500.0,"Ff");
        companyN.addEmployee("Rt1","Bh1","developer",3000.0,"Ff");
        companyN.addEmployee("Rt3","Bh3","developer",4000.0,"Ff");
        companyN.addEmployee("Rt4","Bh4","developer",6000.0,"Ff");
        companyM.sort();
        companyM.delete("Rt","Bh");
        assertNotSame(companyM,companyN);
    }

}