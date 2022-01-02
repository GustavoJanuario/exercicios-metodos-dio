public class Emprestimo {

/*
Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam.
Defina arbitrariamente as faixa que influenciam nos valores.
 */

    public static double getTaxaDuasParcelas() {
        return 0.1;
    }

    public static double getTaxaTresParcela() {
        return 0.2;
    }

    public static double getTaxaQuatroParcela() {
        return 0.35;
    }

    public static void calcularEmprestimo(double valorSolicitado, int parcelas) {
        if (parcelas == 2) {
            double valorFinal = valorSolicitado + (valorSolicitado * getTaxaDuasParcelas());

            System.out.println("Valor final do empréstimo para 2 parcelas será: R$" + valorFinal);

        } else if (parcelas == 3) {
            double valorFinal = valorSolicitado + (valorSolicitado * getTaxaTresParcela());

            System.out.println("Valor final do empréstimo para 3 parcelas será: R$" + valorFinal);

        } else if (parcelas == 4) {
            double valorFinal = valorSolicitado + (valorSolicitado * getTaxaQuatroParcela());

            System.out.println("Valor final do empréstimo para 4 parcelas será: R$" + valorFinal);

        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }
    }

}
