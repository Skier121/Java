package by.epam.javatraining.baranov.tasks;

import project_.Project;
import project.Projects;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
		Projects pj=new Projects();
		pj.addProject("St",new BigDecimal(55),749);
		Project p=pj.findProject("St");
		System.out.println(p.toString());
    }
}
