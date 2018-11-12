package project_;

import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.math.BigDecimal;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Project{
    private final static Logger log=LogManager.getLogger(Project.class);

    public Project(){
        this.projectName="";
        this.projectFounds=new BigDecimal(0);
        this.projectLifetime=0L;
    }
    public Project(String projectName, BigDecimal projectFounds, long projectLifeTime)throws IOException {
        log.info("attempt to create new Project( "+projectName+", "+projectFounds+", "+projectLifeTime+")");
        setProjectName(projectName);
        setProjectFounds(projectFounds);
        setProjectLifetime(projectLifeTime);
    }

    private String projectName;
    private BigDecimal projectFounds;
    private long projectLifetime;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) throws IOException {
        if(projectName.length()==0){
            log.warn("attempt to add value projectName: "+projectName);
            throw new IOException("wrong length");
        }
        else{
            log.info("add projectName: "+projectName);
            this.projectName = projectName;
        }
    }

    public BigDecimal getProjectFounds() {
        return projectFounds;
    }

    public void setProjectFounds(BigDecimal projectFounds) throws IOException {
        if (projectFounds.doubleValue() <= 0) {
            log.warn("attempt to add value projectFounds: "+projectFounds);
            throw new IOException("wrong value");
        }
        else{
            log.info("add projectFounds value: "+projectFounds);
            this.projectFounds = projectFounds;
        }
    }

    public long getProjectLifetime() {
        return projectLifetime;
    }

    public void setProjectLifetime(long projectLifetime) throws IOException {
        if(projectLifetime<=0){
            log.warn("attempt to add projectLifeTime value: "+projectLifetime);
            throw new IOException("wrong life time");
        }
        else{
            log.info("add projectLifeTime value: "+projectLifetime);
            this.projectLifetime = projectLifetime;
        }
    }
}