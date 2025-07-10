package modelo;

public class Financiamento {
    protected double valorImovel;
    protected int prazoFinanciamento;
    protected double taxaJurosAnual;

    public double getValorImovel() {
        return valorImovel;
    }

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double calcularPagamentoMensal() {
        return this.valorImovel / (this.prazoFinanciamento * 12) * (1 + this.taxaJurosAnual / 12 / 100);
    }

    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }

    public void exibirDados() {
        System.out.println("Financiamento:");
        System.out.println("Valor do imóvel: R$ " + valorImovel);
        System.out.println("Prazo (anos): " + prazoFinanciamento);
        System.out.println("Taxa de juros anual: " + taxaJurosAnual + "%");
        System.out.println("Pagamento mensal: R$ " + calcularPagamentoMensal());
        System.out.println("Pagamento total: R$ " + calcularTotalPagamento());
        System.out.println("-------------------------------------------");
    }
}
