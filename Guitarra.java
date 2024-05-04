import java.util.Scanner;

public class Guitarra {
    private String modelo;
    private String cor;
    private int numCordas;

    // Construtor
    public Guitarra(String modelo, String cor, int numCordas) {
        this.modelo = modelo;
        this.cor = cor;
        this.numCordas = numCordas;
    }

    // Método para exibir opções
    public static void exibirOpcoes() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Tocar");
        System.out.println("2. Afinar");
        System.out.println("3. Sair");
    }

    // Método para tocar a guitarra
    public void tocar() {
        System.out.println("Tocando a guitarra " + modelo);
    }

    // Método para afinar a guitarra
    public void afinar() {
        System.out.println("Afinando a guitarra " + modelo);
    }

    public static void main(String[] args) {
        // Criando uma guitarra
        Guitarra minhaGuitarra = new Guitarra("Fender Stratocaster", "Vermelha", 6);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirOpcoes();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    minhaGuitarra.tocar();
                    break;
                case 2:
                    minhaGuitarra.afinar();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}
