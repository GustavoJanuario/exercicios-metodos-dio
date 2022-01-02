public class Main {

/*
Criar uma aplicação que resolva as seguintes situações:

- Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.
- A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite.
- Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam.
  Defina arbitrariamente as faixa que influenciam nos valores.
- Cria uma aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio.
 */

    public static void main(String[] args) {
        System.out.println("Calculadora");
        Calculadora.soma(5, 10);
        Calculadora.subtracao(4, 2);
        Calculadora.multiplicacao(7, 3);
        Calculadora.divisao(45, 5);
        System.out.println();

        System.out.println("Mensagem");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(22);
        Mensagem.obterMensagem(25);
        System.out.println();

        System.out.println("Empréstimo");
        Emprestimo.calcularEmprestimo(1000,2);
        Emprestimo.calcularEmprestimo(1000,3);
        Emprestimo.calcularEmprestimo(1000,4);
        Emprestimo.calcularEmprestimo(1000,5);
        System.out.println();

        System.out.println("Calcular Área");
        CalcularArea.calcularQuadrilatero(50);
        CalcularArea.calcularQuadrilatero(50, 25);
        CalcularArea.calcularQuadrilatero(50,25,10);
        System.out.println();

        System.out.println("Retornos");
        double areaQuadrado = Retornos.calcularQuadrilatero(50);
        System.out.println("Área do quadrado: " + areaQuadrado + "cm²");

        double areaRetangulo = Retornos.calcularQuadrilatero(50, 25);
        System.out.println("Área do retângulo: " + areaRetangulo + "cm²");

        double areaTrapezio = Retornos.calcularQuadrilatero(50, 25, 10);
        System.out.println("Área do trapézio: " + areaTrapezio + "cm²");
    }
}
