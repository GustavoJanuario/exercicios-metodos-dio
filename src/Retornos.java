public class Retornos {

    public static double calcularQuadrilatero(double lado) {
        return lado * lado;
    }

    public static double calcularQuadrilatero(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double calcularQuadrilatero(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

}
