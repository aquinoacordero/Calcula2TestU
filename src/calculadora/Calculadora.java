package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Modelo mode = new Modelo();
        Calculadora calc=new Calculadora();
        Vista.imprimir(calc.realizaOperacion(mode.getNum1(), mode.getNum2(), mode.getOperacion()));
    }

    public String realizaOperacion(float n1, float n2, String op) {
        Scanner dato=new Scanner(System.in);
        if ("sumar".equals(op)) {
            return ("suma=" + (n1 + n2));
        }
        if ("restar".equals(op)) {
            return ("resta=" + (n1 - n2));
        }
        if ("multiplicar".equals(op)) {
            return ("multiplicacion=" + (n1 * n2));
        }
        if ("dividir".equals(op)) {
            return ("division=" + (n1 / n2));
        } else {
            return "inroduce operación valida";
        }

    }

}
