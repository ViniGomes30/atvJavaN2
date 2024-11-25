import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CentralPets centralPets = new CentralPets();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Criar Pessoa");
            System.out.println("2. Criar Cachorro");
            System.out.println("3. Criar Gato");
            System.out.println("4. Adquirir Cachorro");
            System.out.println("5. Adquirir Gato");
            System.out.println("6. Devolver Cachorro");
            System.out.println("7. Devolver Gato");
            System.out.println("8. Obter Cachorros com Dono");
            System.out.println("9. Obter Gatos com Dono");
            System.out.println("10. Obter Cachorros sem Dono");
            System.out.println("11. Obter Gatos sem Dono");
            System.out.println("12. Listar Cachorros de um Determinado Dono");
            System.out.println("13. Listar Gatos de um Determinado Dono");
            System.out.println("14. Listar Pessoas sem Pets");
            System.out.println("15. Listar Pessoas com Mais Pets");
            System.out.println("16. Obter Dono de um Determinado Cachorro");
            System.out.println("17. Obter Dono de um Determinado Gato");
            System.out.println("0. Sair");

            System.out.println("Digite a opção desejada:");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir o \n do buffer

            switch (opcao) {
                case 1:
                    centralPets.criarPessoa();
                    break;
                case 2:
                    centralPets.criarCachorro();
                    break;
                case 3:
                    centralPets.criarGato();
                    break;
                case 4:
                    centralPets.adquirirCachorro();
                    break;
                case 5:
                    centralPets.adquirirGato();
                    break;
                case 6:
                    centralPets.devolverCachorro();
                    break;
                case 7:
                    centralPets.devolverGato();
                    break;
                case 8:
                    centralPets.obterCachorrosComDono();
                    break;
                case 9:
                    centralPets.obterGatosComDono();
                    break;
                case 10:
                    centralPets.obterCachorrosSemDono();
                    break;
                case 11:
                    centralPets.obterGatosSemDono();
                    break;
                case 12:
                    centralPets.listarCachorrosDeterminadoDono();
                    break;
                case 13:
                    centralPets.listarGatosDeterminadoDono();
                    break;
                case 14:
                    centralPets.listarPessoasSemPets();
                    break;
                case 15:
                    centralPets.listarPessoasComMaisPets();
                    break;
                case 16:
                    centralPets.obterDonoDeterminadoCachorro();
                    break;
                case 17:
                    centralPets.obterDonoDeterminadoGato();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}