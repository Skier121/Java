package matrix;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.io.IOException;
import java.util.Random;

//This class realises creation ofmatrix with random values and from file
public class Matrix {
    private final static Logger log= LogManager.getLogger(Matrix.class);
    private double[][]arr;
    private Random r=new Random();

    //constructor for random create matrix
    public Matrix(int x,int y){
        log.info("Matrix random vector class constructor");
        this.generator(x,y);
    }

    //constructor for file stored data
    public Matrix(String path,int x,int y)throws IOException {
        log.info("Matrix class constructor, array from file");
        this.fromFile(path,x,y);
    }

    //generate random-size matrix "arr" on object's creation
    private void generator(int x,int y){
        log.info("generating elements of array");
        this.arr=new double[x][y];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j] = r.nextGaussian();
            }
        }
    }

    //crate and fill matrix from file, which adress is constructor's parameter
    private void fromFile(String path,int x,int y)throws IOException{
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
                throw new IOException("file is empty "+path);
            }
            else if(size<x*y){
                throw new IOException("Not enought elements to fill the matrix "+path);
            }
            this.arr=new double[x][y];
            ds.reset();
            double number=ds.readDouble();
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++) {
                    arr[i][j] = number;
                    number=ds.readDouble();
                }
            }
            log.info("Created array from file"+path);
        }catch(FileNotFoundException e){
            log.warn(e.getMessage());
        }catch(IOException e){
            log.warn(e.getMessage());
        }
    }

    public double[][] getArray(){
        return this.arr;
    }

    public void setArray(double[][] array){
        this.arr=array;
    }

    //print out
    public void print(){
        log.info("print out array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println("\n");
        }
    }
}
