package by.epam.javatraining.baranov.tasks;
import by.epam.javatraining.baranov.tasks.extrem.Extrem;

public class Main {

    public static void main(String[] args) {
		Extrem ex=new Extrem();
		ex.print();
		System.out.println("\n"+ex.max());
		System.out.println(ex.min());
    }
}
