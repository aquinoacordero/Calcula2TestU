package calculadora;

import java.util.Scanner;

public class Calculadora {

    static Modelo mode = new Modelo();

    public String realizaOperacion(float n1, float n2, String op) {

        op = mode.getOperacion();

        if ("sumar".equals(op)) {
            String suma = String.valueOf((n1 + n2));
            return suma;
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
            return "introduce operación valida";
        }

    }

    public static void main(String[] args) {
        // Modelo mode = new Modelo();
        Calculadora calc = new Calculadora();
        System.out.println("introduce la operación que deseas\nsumar\nrestar\nmultiplicar\ndividir\n");
        Scanner dato = new Scanner(System.in);
        mode.setOperacion(dato.nextLine());
        System.out.println("introduce el primer operando");
        Scanner num = new Scanner(System.in);
        mode.setNum1(num.nextFloat());
        System.out.println("introduce el segundo operando");
        Scanner num1 = new Scanner(System.in);
        mode.setNum2(num1.nextFloat());
        Vista.imprimir(calc.realizaOperacion(mode.getNum1(), mode.getNum2(), mode.getOperacion()));
    }

}
