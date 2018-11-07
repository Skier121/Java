package vector;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.io.IOException;
import java.util.Random;

//Class contains methods to manage Array.
public class Vector {
    private final static Logger log= LogManager.getLogger(Vector.class);
    private double[]arr;
    private Random r=new Random();

    //constructor for random create array
    public Vector(){
        log.info("Vector random vector class constructor");
        this.generator();
    }

    //constructor for file stored data
    public Vector(String path)throws IOException {
        log.info("Vector class constructor, array from file");
        this.fromFile(path);
    }

    //generate random-size array "arr" on object's creation
    private void generator(){
        log.info("generating elements of array");
        this.arr=new double[(int)(Math.random()*100)];
        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextGaussian();
        }
    }

    //crate and fill array from file, which adress is constructor's parameter
    private void fromFile(String path)throws IOException{
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
                throw new IOException("file is empty"+path);
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
            log.info("created array from file"+path);
        }catch(FileNotFoundException e){
            log.warn(e.getMessage());
        }catch(IOException e){
            log.warn(e.getMessage());
        }
    }

    public double[] getArray(){
        return this.arr;
    }

    public void setArray(double[] array){
        this.arr=array;
    }

    //print out
    public void print(){
        log.info("print out array");
        for(double d:arr){
            System.out.print(d+" ");
        }
    }
}
