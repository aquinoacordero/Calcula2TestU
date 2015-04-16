package calculadora;

public class Calculadora {

    public String realizaOperacion(float n1, float n2, String op) {
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

    public static void main(String[] args) {
        Modelo mode = new Modelo();

    }

}
