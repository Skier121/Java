package managem;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.junit.Test;

import static org.junit.Assert.*;
import matrix.Matrix;

import java.io.IOException;

public class ManagemTest {
    double[][] matr={{1,2,3,4,5,6,7},{3,4,5,6,7,8,9},{0,-5.0,7,4,8,2,9}};
    double[][] mat={{1,2,3},{3,4,5},{0,-5.0,7}};
    int[]ans={};
    Matrix m=new Matrix(matr);
    Matrix m1=new Matrix(mat);
    Managem mm=new Managem();
    @Test
    public void min() throws IOException {
        assertEquals(-5.0,mm.min(m.getArray()));
    }

    @Test
    public void max() throws IOException{
        assertEquals(9.0,mm.max(m.getArray()));
    }

    @Test
    public void amid() throws IOException{
        assertEquals(4.52,mm.amid(m.getArray()),0.01);
    }

    @Test
    public void gmid()throws IOException {
        assertEquals(0.0,mm.gmid(m.getArray()),0.01);
    }

    @Test
    public void symetric()throws IOException {
        assertEquals(false,mm.symetric(m1.getArray()));
    }
}