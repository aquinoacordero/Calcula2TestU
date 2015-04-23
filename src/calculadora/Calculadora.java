package calculadora;

import java.util.Scanner;

public class Calculadora {

    static Modelo modelo = new Modelo();

    public static float realizaOperacion(float n1, float n2, String op) {

        op = modelo.getOperacion();

        if ("sumar".equals(op)) {
            float res = ((n1 + n2));
            return res;
        }
        if ("restar".equals(op)) {
            float res = (n1 - n2);
            return res;
        }
        if ("multiplicar".equals(op)) {
            float res = (n1 * n2);
            return res;
        }
        if ("dividir".equals(op)) {
            float division = (n1 / n2);
            return division;
        } else {
            System.out.println("introduce operación valida");
            return 0;
        }

    }

    public static void main(String[] args) {

        int valor;
        
        System.out.println("introduce la operación que deseas\nsumar\nrestar\nmultiplicar\ndividir\n");
        Scanner dato = new Scanner(System.in);
        modelo.setOperacion(dato.nextLine());
        
        System.out.println("introduce el primer operando");
        Scanner num = new Scanner(System.in);
        modelo.setNum1(num.nextFloat());
        
        System.out.println("introduce el segundo operando");
        Scanner num1 = new Scanner(System.in);
        modelo.setNum2(num1.nextFloat());

        Vista.imprimir(realizaOperacion(modelo.getNum1(), modelo.getNum2(), modelo.getOperacion()));

    }

}
