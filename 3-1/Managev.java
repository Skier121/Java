package managev;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

//This class realises methods to work with vector
public class Managev {
    private final static Logger log= LogManager.getLogger(Managev.class);

    //search of minimum value
    public double min(double[]arr)throws IOException{
        log.info("min search");
        double minimum=0;
        if(arr.length==0){
            log.warn("Empty array");
            throw new IOException("Bad input data");
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
    public double max(double[]arr) throws IOException {
        log.info("max search");
        double maximum=0;
        if(arr.length==0){
            log.warn("Empty array");
            throw new IOException("Bad input data");
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

    //midarithmetical value
    public double amid(double[] arr) throws IOException {
        log.info("midarithmetical value");
        double res=0;
        if(arr.length==0){
            log.warn("Empty array");
            throw new IOException("Bad input data");
        }
        else{
            double sum=0;
            for (double elem:arr) {
                sum+=elem;
            }
            res=sum/arr.length;
        }
        return res;
    }

    //midgeometrical value
    public double gmid(double[] arr) throws IOException {
        log.info("midgeometrical value");
        double res = 0;
        if (arr.length == 0) {
            log.warn("Empty array");
            throw new IOException("Bad input data");
        } else {
            double sum = 0;
            for (double elem : arr) {
                sum *= elem;
            }
            res = (Math.pow(sum, (1.0/arr.length)));
        }
        return res;
    }

    //order check
    public boolean isOrder(double[]arr){
        log.info("order check");
        boolean res=false;
        int counter=1;
        int counter1=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                counter+=1;
            }
            else{
                break;
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=arr[i-1]){
                counter1+=1;
            }
            else{
                break;
            }
        }
        if(counter==arr.length||counter1==arr.length){
            res=true;
        }
        return res;
    }

    //local min
    public int localMin(double[] arr){
        log.info("local min");
        int res=-1;
        if(arr.length==0){
            return res;
        }
        else{
            for(int i=1;i<arr.length-1;i++){
                if(arr[i]<arr[i-1]&arr[i]<arr[i+1]){
                    res=i;
                    break;
                }
            }
        }
        return res;
    }

    //local max
    public int localMax(double[] arr){
        log.info("local max");
        int res=-1;
        if(arr.length==0){
            return res;
        }
        else{
            for(int i=1;i<arr.length-1;i++){
                if(arr[i]>arr[i-1]&arr[i]>arr[i+1]){
                    res=i;
                    break;
                }
            }
        }
        return res;
    }

    //linear search
    public int lsearch(double[]arr,double value){
        log.info("linear search");
        int res=-1;
        if(arr.length==0){
            return res;
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]==value){
                    res=i;
                    break;
                }
            }
        }
        return res;
    }

    //binary search
    public int bserach(double[]arr,double value) {
        log.info("binary search");
        int res = -1;
        int low = 0;
        int mid = 0;
        int high = arr.length;
        if (arr.length == 0) {
            return res;
        }
        else {
            while (low < high) {
                mid = (low + high) / 2;
                if (arr[mid] == value) {
                    res = mid;
                    break;
                } else {
                    if (value < arr[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return res;
    }

    //reverse
    public int reverse(double[]arr){
        log.info("reverse");
        if(arr.length==0){
            return -1;
        }
        else{
            for(int i=0;i<arr.length/2;i++){
                arr[i]+=arr[arr.length-i-1];
                arr[arr.length-i-1]=arr[i]-arr[arr.length-i-1];
                arr[i]=arr[i]-arr[arr.length-i-1];
            }
        }
        return arr;
    }

    //bubble
    public double[] bubble(double[]arr){
        int temp=0;
        double[]array={};
        if(arr.length==0){
            return array;
        }
        else{
            do{
                for(int i=1;i<arr.length;i++){
                    if(arr[i]<arr[i-1]){
                        arr[i]+=arr[i-1];
                        arr[i-1]=arr[i]-arr[i-1];
                        arr[i]=arr[i]-arr[i-1];
                        temp++;
                    }
                }
            }while(temp!=0);
        }
        return arr;
    }

    //Shell sort
    public double[] shell(double[]arr){
        double[]zero={};
        if(arr.length==0){
            return zero;
        }
        else{
            int step=arr.length/2;
            for(int i=0;i<arr.length-step;i+=step){
                if(arr[i]>arr[i+step]){
                    arr[i]+=arr[i+step];
                    arr[i+step]=arr[i]-arr[i+step];
                    arr[i]=arr[i]-arr[i+step];
                }
                for(int j=i;j>=step;j-=step){
                    if(arr[j]>arr[j-step]) {
                        arr[j] += arr[j - step];
                        arr[j - step] = arr[j] - arr[j - step];
                        arr[j] = arr[j] - arr[j - step];
                    }
                }
            }
        }
        return arr;
        }

}
