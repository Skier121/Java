package by.epam.javatraining.baranov.tasks;

import managev.Managev;
import vector.Vector;
import matrix.Matrix;
import managem.Managem;

public class Main {

    public static void main(String[] args) {
    	Vector v=new Vector();
		Managev man=new Managev();
		System.out.println(man.isOrder(v.getArray()));
		Matrix m=new Matrix(10,15);
		m.print();
    }
}
