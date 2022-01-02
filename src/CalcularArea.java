public class CalcularArea {

/*
Cria uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio.
 */

    public static void calcularQuadrilatero(double lado) {
        double area = lado * lado;
        System.out.println("A área do quadrado " + lado + "cm é " + area + "cm²");
    }

    public static void calcularQuadrilatero(double lado1, double lado2) {
        double area = lado1 * lado2;
        System.out.println("A área do retângulo " + lado1 + "cm por " + lado2 + "cm é " + area + "cm²");
    }

    public static void calcularQuadrilatero(double baseMaior, double baseMenor, double altura) {
        double area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("A área do trapézio " + baseMaior + "cm por " + baseMenor + "cm por " +
                            altura + "cm é " + area + "cm²");
    }
}
