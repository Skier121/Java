package by.epam.javatraining.baranov.tasks.extrem;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.Random;

//class generates random range array of double an has methods for search max and min elements of array
// and method for printing out array
public class Extrem {
    private final static Logger log=Logger.getLogger(Extrem.class);
    private Random r=new Random();
    private double[]arr;

    //random filler for arr
    private void generator(){
        log.info("generating elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextGaussian();
        }
    }
    //generate random-size array "arr" on Extrem's object creation
    public Extrem(){
        log.info("class constructor");
        this.arr=new double[(int)(Math.random()*100)];
        this.generator();
    }
    //crate Extrem object and fill array from file, which adress is constructor's parameter
    public Extrem(String path){
        int size=0;
        try{
            File file=new File(path);
            DataInputStream ds=new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
            ds.readDouble();
            while(ds!=null){
                size+=1;
                ds.readDouble();
            }
            if(size==0){
                throw new IOException("file is empty");
            }
            this.arr=new double[size];
            ds.reset();
            double number=ds.readDouble();
            while(ds!=null){
                for(double elem:arr){
                    elem=number;
                    number=ds.readDouble();
                }
            }
        }catch(FileNotFoundException e){
            log.warn(e.getMessage());
        }catch(IOException e){
            log.warn(e.getMessage());
        }
    }
    //print out
    public void print(){
        log.info("print out array");
        for(double d:arr){
            System.out.print(d+" ");
        }
    }
    //search of minimum value
    public double min(){
        log.info("min search");
        double minimum=0;
        if(arr.length==0){
            minimum=-1;
        }
        else{
            minimum=arr[0];
            for(double elem:arr){
                if(elem<minimum){
                    minimum=elem;
                }
            }
        }
        return minimum;
    }

    //search of maximum value
    public double max(){
        log.info("max search");
        double maximum=0;
        if(arr.length==0){
            maximum=-1;
        }
        else{
            maximum=arr[0];
            for(double elem:arr){
                if(elem>maximum){
                    maximum=elem;
                }
            }
        }
        return maximum;
    }
}