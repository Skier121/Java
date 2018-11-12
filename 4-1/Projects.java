package project;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import project_.Project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.text.html.HTMLDocument;

public class Projects {
    private final static Logger log=LogManager.getLogger(Projects.class);
    private ArrayList<Project> projects= new ArrayList<>();

    public int addProject(String name,BigDecimal founds,long lifetime){
        log.info("try to add new Project( "+name+", "+founds+", "+lifetime+")");
        try {
            projects.add(new Project(name, founds, lifetime));
            return 1;
        }catch(IOException e){
            log.warn(e.getMessage());
        }
        return -1;
    }

    public Project findProject(String name){
        log.info("try to find Project :"+name);
        Iterator<Project> projectIterator=projects.iterator();
        for(Project p:projects){
            if(p.getProjectName().equals(name)){
                return p;
            }
        }
        return new Project();
    }

    public void delete(String name){
        projects.remove(findProject(name));
    }

}
