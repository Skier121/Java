package by.epam.javatraining.baranov.tasks.extrem;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExtremTest {

    @Test
    public void min() {
        double arr[]={1.1,2.3,-5.7,19,5,0,-4};
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
        double expected=-5.7;
        double actual=minimum;
        Assert.assertEquals(expected,actual,0.0000002);
    }

    @Test
    public void max() {
        double arr[]={1.1,2.3,-5.7,19,5,0,-4};
        double expected=19;
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
        double actual=maximum;
        Assert.assertEquals(expected,actual,0.0000002);
    }
}