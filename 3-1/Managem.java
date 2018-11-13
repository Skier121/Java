package managem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

//This class realises methods to work with matrix
public class Managem {
    private final static Logger log=LogManager.getLogger(Managem.class);

    //search of minimum value
    public double min(double[][]arr)throws IOException {
        log.info("min search");
        double minimum=0;
        if(arr.length==0){
            log.warn("Empty array");
            throw new IOException("Bad input data");
        }
        else{
            minimum=arr[0][0];
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++) {
                    if(arr[i][j]<minimum){
                        minimum=arr[i][j];
                    }
                }
            }
        }
        return minimum;
    }

    //search of maximum value
    public double max(double[][]arr) throws IOException {
        log.info("max search");
        double maximum=0;
        if(arr.length==0){
            log.warn("Empty array");
            throw new IOException("Bad input data");
        }
        else{
            maximum=arr[0][0];
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++) {
                    if(arr[i][j]>maximum){
                        maximum=arr[i][j];
                    }
                }
            }
        }
        return maximum;
    }

    //midarithmetical value
    public double amid(double[][] arr) throws IOException {
        log.info("midarithmetical value");
        double res=0;
        if(arr.length==0){
            log.warn("Empty array");
            throw new IOException("Bad input data");
        }
        else{
            double sum=0;
            int elem=0;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++) {
                    sum+=arr[i][j];
                    elem++;
                }
            }
            res=sum/elem;
        }
        return res;
    }

    //midgeometrical value
    public double gmid(double[][] arr) throws IOException {
        log.info("midgeometrical value");
        double res = 0;
        if (arr.length == 0) {
            log.warn("Empty array");
            throw new IOException("Bad input data");
        } else {
            double sum = 1;
            int elem=0;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++) {
                    sum*=arr[i][j];
                    elem++;
                }
            }
            res = (Math.pow(sum, (1.0/elem)));
        }
        return res;
    }

    //is symetric
    public boolean symetric(double[][]arr) throws IOException {
        if(arr.length==0){
            log.warn("Empty matrix");
            throw new IOException("Bad input data");
        }
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                if(arr[i][j]!=arr[j][i]){
                    k=1;
                    break;
                }
            }
        }
        if(k==0){
            return true;
        }
        else{
            for(int i=0;i<arr.length;i++) {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    if (arr[i][j] != arr[j][i]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    //local minimum search
    public int[] lmin(double[][]arr) throws IOException {
        log.info("Local minimum search");
        int[]array={};
        if(arr.length==0){
            log.warn("Empty matrix");
            throw new IOException("Bad input data");
        }
        else{
            for(int i=1;i<arr.length-1;i++){
                for(int j=1;j<arr[i].length-1;j++){
                    if((arr[i][j]<arr[i-1][j])&(arr[i][j]<arr[i+1][j])&(arr[i][j]<arr[i-1][j])&
                            (arr[i][j]<arr[i-1][j-1])& (arr[i][j]<arr[i+1][j])){
                        array[0]=i;
                        array[1]=j;
                        return array;
                    }
                }
            }
        }
        return array;
    }

    //local maximum search
    public int[] lmax(double[][]arr) throws IOException {
        log.info("Local maximum search");
        int[]array={};
        if(arr.length==0){
            log.warn("Empty matrix");
            throw new IOException("Bad input data");
        }
        else{
            for(int i=1;i<arr.length-1;i++){
                for(int j=1;j<arr[i].length-1;j++){
                    if((arr[i][j]>arr[i-1][j])&(arr[i][j]>arr[i+1][j])&(arr[i][j]>arr[i-1][j])&
                            (arr[i][j]>arr[i-1][j-1])& (arr[i][j]>arr[i+1][j])){
                        array[0]=i;
                        array[1]=j;
                        return array;
                    }
                }
            }
        }
        return array;
    }

    //matrix transposition
    public double[][] transposition(double[][]arr)throws IOException{
        log.info("Matrix transposition");
        if(arr.length==0){
            log.warn("Empty matrix");
            throw new IOException("Bad input data");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length;j++){
                arr[i][j]+=arr[j][i];
                arr[j][i]=arr[i][j]-arr[j][i];
                arr[i][j]=arr[i][j]-arr[j][i];
            }
        }
        return arr;
    }
}
