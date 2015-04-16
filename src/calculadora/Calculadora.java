package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Modelo mode = new Modelo();
        Calculadora calc = new Calculadora();
        Vista.imprimir(calc.realizaOperacion(mode.getNum1(), mode.getNum2(), mode.getOperacion()));
    }

    public String realizaOperacion(float n1, float n2, String op) {
        Modelo mode = new Modelo();
        System.out.println("introduce la operación que deseas\nsumar\nrestar\nmultiplicar\ndividir\n");
        Scanner dato = new Scanner(System.in);
        op = dato.nextLine();
        System.out.println("introduce el primer operando");
        Scanner num = new Scanner(System.in);
        mode.setNum1(num.nextFloat());
        System.out.println("introduce el segundo operando");
        Scanner num1 = new Scanner(System.in);
        mode.setNum2(num.nextFloat());

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
