package ec.edu.utpl.cc.programacion.demo;

public class Calculador {
    private int number1;
    private int number2;

    public Calculador(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int suma() {
        return number1 + number2;
    }
}
