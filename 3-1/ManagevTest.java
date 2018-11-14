package managev;

import org.junit.Test;

import static org.junit.Assert.*;
import vector.Vector;
import managev.Managev;

import java.io.IOException;

public class ManagevTest {
    double[]v={1,2,3,4,5,6,7,8,9,0};
    Managev m=new Managev();

    @Test
    public void min() throws IOException {
        assertEquals(0.0,m.min(v));
    }

    @Test
    public void max()throws IOException {
        assertEquals(9.0,m.max(v));
    }

    @Test
    public void amid()throws IOException {
        assertEquals(4.5,m.amid(v));
    }

    @Test
    public void gmid()throws IOException {
        assertEquals(0.0,m.gmid(v));
    }

    @Test
    public void isOrder()throws IOException {
        assertEquals(false,m.isOrder(v));
    }

    @Test
    public void localMin() {
        assertEquals(-1,m.localMin(v));
    }

    @Test
    public void localMax() {
        assertEquals(8,m.localMax(v));
    }

    @Test
    public void lsearch()throws IOException {
        assertEquals(0,m.lsearch(v,1.0));
    }

    @Test
    public void bserach() {
        assertEquals(0,m.bserach(v,1.0));
    }
}