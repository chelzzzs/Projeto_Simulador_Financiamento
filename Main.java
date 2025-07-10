package modelo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Financiamento> listaFinanciamentos = new ArrayList<>();

        InterfaceUsuario iu = new InterfaceUsuario();
        InterfaceUsuario.interfaceUsuario interfaceUsuario = iu.new interfaceUsuario();

        try {
            System.out.println("Cadastro de financiamento de Casa:");
            Casa casa = new Casa(
                    interfaceUsuario.pedirValorImovel(),
                    interfaceUsuario.pedirPrazoFinanciamento(),
                    interfaceUsuario.pedirTaxaJuros(),
                    interfaceUsuario.pedirAreaConstruida(),
                    interfaceUsuario.pedirTamanhoTerreno()
            );
            listaFinanciamentos.add(casa);


            System.out.println("Cadastro de financiamento de Terreno:");
            Terreno terreno = new Terreno(
                    interfaceUsuario.pedirValorImovel(),
                    interfaceUsuario.pedirPrazoFinanciamento(),
                    interfaceUsuario.pedirTaxaJuros(),
                    interfaceUsuario.pedirTipoZona()
            );
            listaFinanciamentos.add(terreno);

            // Exemplo com dados fixos
            Casa casaFixa = new Casa(250000, 20, 5, 150, 300);
            listaFinanciamentos.add(casaFixa);

        } catch (AumentoMaiorDoQueJurosException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }

        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        for (Financiamento f : listaFinanciamentos) {
            f.exibirDados();
            totalImoveis += f.valorImovel;
            totalFinanciamentos += f.calcularTotalPagamento();
        }

        System.out.println("TOTAL DOS IMÓVEIS: R$ " + totalImoveis);
        System.out.println("TOTAL DOS FINANCIAMENTOS: R$ " + totalFinanciamentos);
    }
}
