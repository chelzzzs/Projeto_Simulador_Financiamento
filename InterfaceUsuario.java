package modelo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {

    public class interfaceUsuario {
        private Scanner scanner = new Scanner(System.in);

        public double pedirValorImovel() {
            double valor = -1;
            do {
                try {
                    System.out.print("Digite o valor do imóvel: ");
                    valor = scanner.nextDouble();
                    if (valor <= 0) {
                        System.out.println("Valor inválido. Deve ser maior que zero.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número válido.");
                    scanner.nextLine();
                }
            } while (valor <= 0);
            return valor;
        }

        public int pedirPrazoFinanciamento() {
            int prazo = -1;
            do {
                try {
                    System.out.print("Digite o prazo do financiamento (em anos): ");
                    prazo = scanner.nextInt();
                    if (prazo <= 0) {
                        System.out.println("Prazo inválido. Deve ser maior que zero.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
                    scanner.nextLine();
                }
            } while (prazo <= 0);
            return prazo;
        }

        public double pedirTaxaJuros() {
            double taxa = -1;
            do {
                try {
                    System.out.print("Digite a taxa de juros anual (ex: 5 para 5%): ");
                    taxa = scanner.nextDouble();
                    if (taxa <= 0) {
                        System.out.println("Taxa inválida. Deve ser maior que zero.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número válido.");
                    scanner.nextLine();
                }
            } while (taxa <= 0);
            return taxa;
        }

        public double pedirAreaConstruida() {
            double area = -1;
            do {
                try {
                    System.out.print("Digite a área construída (em m²): ");
                    area = scanner.nextDouble();
                    if (area <= 0) {
                        System.out.println("Área inválida. Deve ser maior que zero.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número válido.");
                    scanner.nextLine();
                }
            } while (area <= 0);
            return area;
        }

        public double pedirTamanhoTerreno() {
            double tamanho = -1;
            do {
                try {
                    System.out.print("Digite o tamanho do terreno (em m²): ");
                    tamanho = scanner.nextDouble();
                    if (tamanho <= 0) {
                        System.out.println("Tamanho inválido. Deve ser maior que zero.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número válido.");
                    scanner.nextLine();
                }
            } while (tamanho <= 0);
            return tamanho;
        }

        public int pedirVagasGaragem() {
            int vagas = -1;
            do {
                try {
                    System.out.print("Digite o número de vagas na garagem: ");
                    vagas = scanner.nextInt();
                    if (vagas < 0) {
                        System.out.println("Número inválido. Deve ser zero ou maior.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
                    scanner.nextLine();
                }
            } while (vagas < 0);
            return vagas;
        }

        public int pedirNumeroAndar() {
            int andar = -1;
            do {
                try {
                    System.out.print("Digite o número do andar: ");
                    andar = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
                    scanner.nextLine();
                }
            } while (andar < 0);
            return andar;
        }

        public String pedirTipoZona() {
            System.out.print("Digite o tipo de zona (Residencial ou Comercial): ");
            return scanner.next();
        }
    }
}
