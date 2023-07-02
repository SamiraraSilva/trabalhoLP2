public class Bebe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do bebê: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o peso inicial do bebê (em gramas): ");
        double pesoInicial = scanner.nextDouble();

        System.out.print("Digite o peso do bebê após 5 dias (em gramas): ");
        double pesoAtual = scanner.nextDouble();

        double percentual = ((pesoAtual - pesoInicial) / pesoInicial) * 100;

      
        System.out.println("Nome do bebê: " + nome);
        System.out.println("Peso inicial: " + pesoInicial + " gramas");
        System.out.println("Peso após 5 dias: " + pesoAtual + " gramas");
        System.out.printf("Percentual de perda/ganho de peso: %.2f%%\n", percentual);
      

        scanner.close();
    }
}


