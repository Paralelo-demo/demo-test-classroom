package ec.edu.utpl.cc.programacion;


import ec.edu.utpl.cc.programacion.demo.Calculador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void suma() {
        Calculador calc = new Calculador(1, 2);
        Assertions.assertEquals(4, calc.suma(), "Test suma");
    }

}
