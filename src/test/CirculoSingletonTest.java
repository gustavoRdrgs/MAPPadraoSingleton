package test;

//import org.junit.Test;
//import static org.junit.Assert.assertEquals;

import java.util.Scanner;
import FormasGeometricas.CirculoSingleton;

public class CirculoSingletonTest {

    Scanner scTest2 = new Scanner("4.0");
    Scanner scTest1 = new Scanner("2.0");
    CirculoSingleton circuloTest1 = CirculoSingleton.getInstance(scTest1);
    CirculoSingleton circuloTest2 = CirculoSingleton.getInstance(scTest2);

    //@Test
    public void testGetInstance() {
        //assertEquals(circuloTest2, circuloTest1);
    }

    //@Test
    public void testMostrarArea() {
        //assertEquals(CirculoSingleton.mostrarArea(), "A área do círculo é de 12.5664");

    }
}
