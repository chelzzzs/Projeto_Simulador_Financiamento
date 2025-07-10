package modelo;

public class Apartamento extends Financiamento {
        private int vagasGaragem;
        private int numeroAndar;

        public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual,
                           int vagasGaragem, int numeroAndar) {
            super(valorImovel, prazoFinanciamento, taxaJurosAnual);
            this.vagasGaragem = vagasGaragem;
            this.numeroAndar = numeroAndar;
        }

        @Override
        public void exibirDados() {
            System.out.println("Financiamento de Apartamento:");
            System.out.println("Valor do imóvel: R$ " + getValorImovel());
            System.out.println("Valor total do financiamento: R$ " + calcularTotalPagamento());
            System.out.println("Número de vagas na garagem: " + vagasGaragem);
            System.out.println("Número do andar: " + numeroAndar);
            System.out.println("-------------------------------------------");
        }
    }


