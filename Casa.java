package modelo;

public class Casa extends Financiamento {
    private double areaConstruida;
    private double tamanhoTerreno;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual,
                double areaConstruida, double tamanhoTerreno) throws AumentoMaiorDoQueJurosException {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;

        double jurosMensalidade = calcularJurosMensalidade();
        double acrescimo = 80;
        if (acrescimo > (jurosMensalidade / 2)) {
            throw new AumentoMaiorDoQueJurosException("Acréscimo de R$80 é maior que a metade dos juros da mensalidade.");
        }
    }

    public double calcularJurosMensalidade() {
        return calcularPagamentoMensal() * (taxaJurosAnual / 100) / 12;
    }

    @Override
    public void exibirDados() {
        System.out.println("Financiamento de Casa:");
        System.out.println("Valor do imóvel: R$ " + valorImovel);
        System.out.println("Valor total do financiamento: R$ " + calcularJurosMensalidade());
        System.out.println("Área construída: " + areaConstruida + " m²");
        System.out.println("Tamanho do terreno: " + tamanhoTerreno + " m²");
        System.out.println("-------------------------------------------");
    }
}
